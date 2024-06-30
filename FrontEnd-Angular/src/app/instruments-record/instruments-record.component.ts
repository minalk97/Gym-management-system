import { Component, OnInit } from '@angular/core';
import { HomeService } from '../home.service';

@Component({
  selector: 'app-instruments-record',
  templateUrl: './instruments-record.component.html',
  styleUrls: ['./instruments-record.component.css']
})
export class InstrumentsRecordComponent implements OnInit {
  data:any;
  constructor(public svc:HomeService) { }

  ngOnInit() {
    this.svc.getAllInstrumentsRecord().subscribe(
        data=>{
          this.data=data;
          console.log(data);
        }
    )
  }

}
