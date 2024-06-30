import { Register } from './register'
import { Trainer } from './trainer';

export class Allocation
{
    memberid:Register;
    membername:Register
    email:Register
    password:Register
    contactno:Register
    age:Register 
    address:Register
    confirmpassword:Register
    trainerid:Trainer;
    trainername:Trainer;
    //email:Trainer;
   // password:Trainer;
    speciality:Trainer; 
    availability:Trainer; 
    doj:Trainer;
    id:number;
    mememail:string;
    traineremail:string;
}
