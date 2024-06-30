import { Component, OnInit } from '@angular/core';
import { HomeService } from '../home.service';
//import { MainrouterComponent } from '../mainrouter/mainrouter.component';
import { Member } from '../memberdetails';
import {enableProdMode} from '@angular/core';
enableProdMode();
@Component({
  selector: 'app-basicprofile',
  templateUrl: './basicprofile.component.html',
  styleUrls: ['./basicprofile.component.css']
})


export class BasicprofileComponent implements OnInit {
  email=sessionStorage.getItem('sessionId')
member:Member;
  constructor(public svc:HomeService) { }

  ngOnInit() {
   
    this.svc.getMemberByIdFromREST(this.email).subscribe(
      member=>{
        this.member=member;
        console.log(this.member);
        let sid=sessionStorage.getItem('sessionId')
             console.log(sid);   
                                         
  }
    )
    
  }
  goback()
  {
    this.svc.back();
  }
   
}

