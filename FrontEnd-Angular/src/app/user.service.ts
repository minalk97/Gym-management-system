import { Injectable } from '@angular/core';
import { Register } from './register';
import { HttpClient } from '@angular/common/http';
import { Trainer } from './trainer';
@Injectable({
  providedIn: 'root'
})
export class UserService {

    constructor(private http: HttpClient) { }

    
  
    register(register: Register) {
        return this.http.post('/api/register', register);
    }
    addTrainer(trainer: Trainer) {
        return this.http.post('/api/trainerregister', trainer);
    }

  }
  