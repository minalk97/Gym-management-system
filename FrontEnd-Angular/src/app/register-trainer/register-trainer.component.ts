import { Component, OnInit } from '@angular/core';
import { Trainer } from '../trainer';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
import { AlertService } from '../alert.service';

@Component({
  selector: 'app-register-trainer',
  templateUrl: './register-trainer.component.html',
  styleUrls: ['./register-trainer.component.css']
})
export class RegisterTrainerComponent implements OnInit {

  trainer:Trainer;

  registerForm: FormGroup;
  loading = false;
  submitted = false;

  constructor(
      private formBuilder: FormBuilder,
      private router: Router,
      private userService: UserService,
      private alertService: AlertService) { }

  ngOnInit() {
      this.registerForm = this.formBuilder.group({
          trainername: ['', Validators.required],
          email: ['', Validators.required],
          password: ['', [Validators.required, Validators.minLength(6)]],
          speciality: ['', Validators.required],
          availability: ['', Validators.required],
          doj: ['', Validators.required]
      });
  }

  // convenience getter for easy access to form fields
  get f() { return this.registerForm.controls; }

  onSubmit() {
      this.submitted = true;

      // stop here if form is invalid
      if (this.registerForm.invalid) {
          return;
      }

      this.loading = true;
      this.userService.addTrainer(this.registerForm.value)
          .pipe()
          .subscribe(
              data => {
              console.log(data);
              alert("Registration successful");
                  this.router.navigate(['/manager']);
              },
              error => {
                  this.alertService.error(error);
                  this.loading = false;
              });
  }
}
