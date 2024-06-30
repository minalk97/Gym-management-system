import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { RouterModule, Routes } from '@angular/router';
import { MainrouterComponent } from './mainrouter/mainrouter.component';
import { LoginComponent } from './login/login.component';
import { ContactComponent } from './contact/contact.component';
import { RegisterComponent } from './register/register.component';
import { BasicprofileComponent } from './basicprofile/basicprofile.component';
import { HttpClientModule } from "@angular/common/http";
import { ReactiveFormsModule } from '@angular/forms';
import { MyscheduleComponent } from './myschedule/myschedule.component';
import { MydietplanComponent } from './mydietplan/mydietplan.component';
import { TrainerComponent } from './trainer/trainer.component';
import { DetailsComponent } from './details/details.component';
import { MemberLoginComponent } from './member-login/member-login.component';
import { TrainerLoginComponent } from './trainer-login/trainer-login.component';
import { ManagerLoginComponent } from './manager-login/manager-login.component';
import { ManagerComponent } from './manager/manager.component';
import { MemberComponent } from './member/member.component';
import { ViewMemberComponent } from './view-member/view-member.component';
import { ViewTrainerComponent } from './view-trainer/view-trainer.component';
import { RegisterTrainerComponent } from './register-trainer/register-trainer.component';
import { InstrumentsRecordComponent } from './instruments-record/instruments-record.component';
import { TrainerProfileComponent } from './trainer-profile/trainer-profile.component';
import { TrainerBasicprofileComponent } from './trainer-basicprofile/trainer-basicprofile.component';
import { AlltrainersComponent } from './alltrainers/alltrainers.component';
import { TrainerdetailsComponent } from './trainerdetails/trainerdetails.component';
import { ManagerAllMembersComponent } from './manager-all-members/manager-all-members.component';
import { ManagerMemberDetailsComponent } from './manager-member-details/manager-member-details.component';
import { AllocatetrainerComponent } from './allocatetrainer/allocatetrainer.component';
import { AddscheduleComponent } from './addschedule/addschedule.component';
import { AdddietplanComponent } from './adddietplan/adddietplan.component';
export const routes:Routes=[     //add
  {path:'home', component:HomeComponent},
  {path:'login', component:LoginComponent},
  {path:'exerciseSchedule', component:MyscheduleComponent},
  {path:'register', component:RegisterComponent},
  {path:'basicprofile',component:BasicprofileComponent},
  {path:'trainer',component:TrainerComponent},
  {path:'details',component:DetailsComponent},
  {path:'memberlogin',component:MemberLoginComponent},
  {path:'trainerlogin',component:TrainerLoginComponent},
  {path:'managerlogin',component:ManagerLoginComponent},
  {path:'viewmember',component:ViewMemberComponent},
  {path:'viewtrainer',component:ViewTrainerComponent},
  {path:'registertrainer',component:RegisterTrainerComponent},
  {path:'member',component:MemberComponent},
  {path:'manager',component:ManagerComponent},
  {path:'myschedule',component:MyscheduleComponent},
  {path:'mydietplan',component:MydietplanComponent},
  {path:'trainerprofile',component:TrainerProfileComponent},
  {path:'trainerbasicprofile',component:TrainerBasicprofileComponent},
  {path:'trainerdetails',component:TrainerdetailsComponent},
  {path:'alltrainers',component:AlltrainersComponent},
  {path:'managerallmembers',component:ManagerAllMembersComponent},
{path:'managermemberdetails',component:ManagerMemberDetailsComponent},
{path:'dietPlanByMember', component:MydietplanComponent},
  { path: 'allocatetrainer', component: AllocatetrainerComponent },
  { path: 'instrumentsRecord', component: InstrumentsRecordComponent },
{ path: 'addschedule', component: AddscheduleComponent },
{ path: 'adddietplan', component: AdddietplanComponent }
];
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    MainrouterComponent,
    LoginComponent,
    ContactComponent,
    RegisterComponent,
    BasicprofileComponent,
    MyscheduleComponent,
    MydietplanComponent,
    TrainerComponent,
    DetailsComponent,
    MemberLoginComponent,
    TrainerLoginComponent,
    ManagerLoginComponent,
    ManagerComponent,
    MemberComponent,
    ViewMemberComponent,
    ViewTrainerComponent,
    RegisterTrainerComponent,
    InstrumentsRecordComponent,
    TrainerProfileComponent,
    TrainerBasicprofileComponent,
    AlltrainersComponent,
    TrainerdetailsComponent,
    ManagerAllMembersComponent,
    ManagerMemberDetailsComponent,
    AllocatetrainerComponent,
    AddscheduleComponent,
    AdddietplanComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes),//add
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
