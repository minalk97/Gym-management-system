import { Component, OnInit } from '@angular/core';
import { MealChart } from '../mealchart';
import { FoodItem } from '../fooditem';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { HomeService } from '../home.service';
import { AlertService } from '../alert.service';

@Component({
  selector: 'app-adddietplan',
  templateUrl: './adddietplan.component.html',
  styleUrls: ['./adddietplan.component.css']
})
export class AdddietplanComponent implements OnInit {
  mealchart: MealChart;
  fooditem: FoodItem;
  dietplanForm: FormGroup;
  loading = false;
  submitted = false;
  mealtypes: any;
  fooditems: any;
  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private svc: HomeService,
    private alertService: AlertService
  ) { }

  ngOnInit() {
    this.dietplanForm = this.formBuilder.group({
      email: ['', Validators.required],
      date: ['', Validators.required],
      mealid: ['', Validators.required],
      foodid: ['', Validators.required]
    });
    this.svc.getAllMealChartDetails().subscribe(
      mealtypes => {
        this.mealtypes = mealtypes;
      });

    this.svc.getAllFoodItemDetails().subscribe(
      fooditems => {
        this.fooditems = fooditems;
      }
    )
  }

  get f() { return this.dietplanForm.controls; }

  onSubmit() {
    this.submitted = true;

    // stop here if form is invalid
    if (this.dietplanForm.invalid) {
      return;
    }

    this.loading = true;
    this.svc.addDietPlan(this.dietplanForm.value).pipe()
      .subscribe(
        data => {
          console.log(data);
          alert("Diet Plan Added");
          this.router.navigate(['/trainer']);
        },
        error => {
          this.alertService.error(error);
          this.loading = false;
        });
  }

}

