import { Component, OnInit } from '@angular/core';
import { HomeService } from '../home.service';
import { FormsModule, FormGroup, FormControl, Validators, ReactiveFormsModule, FormBuilder } from '@angular/forms';
import { RouteConfigLoadStart, Router, ActivatedRoute } from '@angular/router';
import { AuthenticationService } from '../authentication.service';
import { AlertService } from '../alert.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  
  constructor(
     ) {}
      ngOnInit() {
     
        }

    }