import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { AlertService } from '../alert.service';
import { HomeService } from '../home.service';
import { Router } from '@angular/router';
import { Schedule } from '../schedule';

@Component({
  selector: 'app-addschedule',
  templateUrl: './addschedule.component.html',
  styleUrls: ['./addschedule.component.css']
})
export class AddscheduleComponent implements OnInit {


  schedule: Schedule;
  scheduleForm: FormGroup;
  loading = false;
  submitted = false;
  exercises: any;
  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private svc: HomeService,
    private alertService: AlertService) { }

  ngOnInit() {

    this.scheduleForm = this.formBuilder.group({
      email: ['', Validators.required],
      date: ['', Validators.required],
      exerciseid: ['', Validators.required],
      sets: ['', Validators.required],
      time: ['', Validators.required],
    });
    this.svc.getAllExercise().subscribe(
      exercises => {
        this.exercises = exercises;
      }
    )
  }
  // convenience getter for easy access to form fields
  get f() { return this.scheduleForm.controls; }

  onSubmit() {
    this.submitted = true;

    // stop here if form is invalid
    if (this.scheduleForm.invalid) {
      return;
    }

    this.loading = true;
    this.svc.addSchedule(this.scheduleForm.value).pipe()
      .subscribe(
        data => {
          console.log(data);
          alert("Exercise Plan Added");
          this.router.navigate(['/trainer']);
        },
        error => {
          this.alertService.error(error);
          this.loading = false;
        });
  }


}
