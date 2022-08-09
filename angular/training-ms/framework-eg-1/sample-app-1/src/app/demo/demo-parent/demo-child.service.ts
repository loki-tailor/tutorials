import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DemoChildService {

  serviceMessage = "[demo-child.service.ts] hello from service !"

  // #DI
  private subject = new BehaviorSubject<string>("default subject message");
  messageSource = this.subject.asObservable();

  constructor() { }

  getServiceMessage(): string {
    return this.serviceMessage;
  }

  setServiceMessage(message: string) {
    this.serviceMessage = message;
  }

  changeMessage(message: string) {
    this.subject.next(message);
  }
  
}
