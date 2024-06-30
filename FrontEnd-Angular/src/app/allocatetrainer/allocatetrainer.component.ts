import { Component, OnInit } from '@angular/core';
import { HomeService } from '../home.service';
import { FormsModule, FormGroup, FormControl, Validators, ReactiveFormsModule, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { Register } from '../register';
import { analyzeAndValidateNgModules } from '@angular/compiler';
import { UserService } from '../user.service';
import { AlertService } from '../alert.service';
import { Trainer } from '../trainer';
import { Member } from '../memberdetails';

@Component({
  selector: 'app-allocatetrainer',
  templateUrl: './allocatetrainer.component.html',
  styleUrls: ['./allocatetrainer.component.css']
})
export class AllocatetrainerComponent implements OnInit {
  registerForm: FormGroup;
  emailst:Trainer;
  emailsm:Member; 
  loading=false;
  submitted=false;
  constructor(private formBuilder: FormBuilder,
    private router: Router,public svc:HomeService) { }

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      mememail: ['', Validators.required],
      traineremail: ['', Validators.required]
   });
   this.svc.getAllTrainers().subscribe(
     emailst=>{
       this.emailst=emailst;
       console.log(emailst);
     })
     this.svc.getAllMembers().subscribe(
       emailsm=>{
         this.emailsm=emailsm;
       }
     )
   
  }
    get f() {return this.registerForm.controls;}
    
    onSubmit()
    {
      this.submitted=true;
      if(this.registerForm.invalid)
      {
        
      }
      this.loading=true;
      this.svc.allocateTrainer(this.registerForm.value)
        .pipe()
          .subscribe(
              data => {
                  console.log(data);
                 alert('Trainer Allocated');
                 console.log('allocated');
                  this.router.navigate(['/manager']);
              }
      
            )
          };
}
