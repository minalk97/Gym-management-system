import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Register } from './register';
import { Member } from './memberdetails';
import { HomeService } from './home.service';
import { Manager } from './manager';
import { Trainer } from './trainer';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
sid:any;
member:Member;
  constructor(private http: HttpClient,public svc:HomeService) { }

  memberLogin(email: string, password: string) {
  
      return this.http.post<Register>('/api/authenticate', { email: email, password: password })
          .pipe(map(user => {
              sessionStorage.setItem('sessionId',email);
              let sid=sessionStorage.getItem('sessionId')
              console.log(sid);
              return user;
          }));
  
  }
  managerLogin(email: string, password: string) {
   
    return this.http.post<Manager>('/api/authenticateManager', { managerid: email, password: password })
    
        .pipe(map(user => {
          sessionStorage.setItem('sessionManagerId',email);
          let sid=sessionStorage.getItem('sessionId')
           
            return user;
        }));

}
trainerLogin(email: string, password: string) {
  
  return this.http.post<Trainer>('/api/authenticatetrainer', { email: email, password: password })
      .pipe(map(user => {
          sessionStorage.setItem('sessionTrainerId',email);
          let sid=sessionStorage.getItem('sessionId')
          return user;
      }));

}
  logout() {
      // remove user from local storage to log user out
      localStorage.removeItem('sessionId');
  }
}
