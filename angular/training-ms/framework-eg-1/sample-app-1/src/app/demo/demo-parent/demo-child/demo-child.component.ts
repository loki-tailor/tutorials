import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { DemoChildService } from '../demo-child.service';

@Component({
  selector: 'app-demo-child',
  templateUrl: './demo-child.component.html',
  styleUrls: ['./demo-child.component.scss']
})
export class DemoChildComponent implements OnInit {

  @Input() childMessageAsInput: any;
  @Output() childEventForParentVar = new EventEmitter();
  childMessageForParent = "[demo-child.component.ts] hello from child variable !"
  serviceMessage = '';
  serviceSubMessage = '';

  constructor(private service: DemoChildService) { }

  ngOnInit(): void {
    this.serviceMessage = this.service.getServiceMessage();
    this.service.messageSource.subscribe(message => this.serviceSubMessage = message);
  }

  childEventForParentVarFun() {
    this.childEventForParentVar.emit("[demo-child.component.ts] message is being emit() from child to the listner child...")
    this.service.setServiceMessage('[new message] [done via demo-child.component.ts]');
    this.serviceMessage = this.service.getServiceMessage();
  }

  sendUpdate() {
    this.service.changeMessage("[new message] [via behaviorsubject] [done via demo-child.component.ts] lokeshwar !")
  }

}
