import { Component, OnInit } from '@angular/core';
import { HomeService } from '../home.service';
import { FormsModule, FormGroup, FormControl, Validators, ReactiveFormsModule, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { Register } from '../register';
import { analyzeAndValidateNgModules } from '@angular/compiler';
import { UserService } from '../user.service';
import { AlertService } from '../alert.service';
import { Membership } from '../membership';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  register:Register;
plans:Membership;
  registerForm: FormGroup;
  loading = false;
  submitted = false;

  constructor(public svc:HomeService,
      private formBuilder: FormBuilder,
      private router: Router,
      private userService: UserService,
      private alertService: AlertService) { }

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      name: ['', [Validators.required, Validators.maxLength(45)]],
      email: ['', [Validators.required, Validators.pattern('[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$'),Validators.maxLength(45)]],
        password: ['', [Validators.required, Validators.minLength(6), Validators.maxLength(8)]],
        cpassword: ['', [Validators.required, Validators.minLength(6), Validators.maxLength(8)]],
        contactno: ['', [Validators.required, Validators.minLength(10), Validators.maxLength(10), Validators.pattern('[6-9]\\d{9}')]],
      age: ['', [Validators.required, Validators.min(15), Validators.max(75),Validators.pattern('\\d{2}')]],
      address: ['', [Validators.required, Validators.maxLength(45)]],
      membershipid:['', Validators.required],
      height: ['', [Validators.required, Validators.pattern('\\d{2}')]],
      weight: ['', [Validators.required, Validators.pattern('\\d{2}')]]

      });
this.svc.getAllMembershipPlans().subscribe(
        plans=>{
          this.plans=plans;
        }
      )
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
      this.userService.register(this.registerForm.value)
          .pipe()
          .subscribe(
              data => {
                  console.log(data);
              alert("Registration successful");
                  this.router.navigate(['/login']);
              },
              error => {
                  this.alertService.error(error);
                  this.loading = false;
              });
  }
}
