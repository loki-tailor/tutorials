import { AfterViewInit, ChangeDetectorRef, Component, OnInit, ViewChild } from '@angular/core';
import { DemoChildService } from './demo-child.service';
import { DemoChildComponent } from './demo-child/demo-child.component';

@Component({
  selector: 'app-demo-parent',
  templateUrl: './demo-parent.component.html',
  styleUrls: ['./demo-parent.component.scss']
})
export class DemoParentComponent implements OnInit, AfterViewInit {

  parentMessageVar = "[demo-parent.component.ts] I'm a Parent !";
  parentMessageComingFromChildVar = "";
  parentMessageComingFromChildVar2 = "";
  serviceMessage = '';
  serviceSubMessage = '';

  @ViewChild(DemoChildComponent) child !: DemoChildComponent;

  constructor(private service: DemoChildService, private cd: ChangeDetectorRef) {

  }

  ngOnInit(): void {
    // ref: https://angular.io/errors/NG0100

    // setTimeout(() => {
    // this.parentMessageComingFromChildVar2 = this.child.childMessageForParent;
    // }, 0);

    this.serviceMessage = this.service.getServiceMessage();
    this.service.messageSource.subscribe(msg => this.serviceSubMessage = msg);

    Promise.resolve().then(() => this.parentMessageComingFromChildVar2 = this.child.childMessageForParent);

    // this.parentMessageComingFromChildVar2 = this.child.childMessageForParent;
    // this.cd.detectChanges();

  }

  ngAfterViewInit(): void {
    // using this here will cause below exceptioin in console logs (only during dev mode)
    // also it will fetch and populate value from child rather than '' in first load
    // ref: https://angular.io/errors/NG0100

    // this.parentMessageComingFromChildVar2 = this.child.childMessageForParent;
  }

  receiveEventFromChild($event: any) { this.parentMessageComingFromChildVar = $event; }

  sendUpdateFromParent() {
    this.service.changeMessage("[new message] [via behaviorsubject] [done via demo-PARENT.component.ts] tailor !")
  }

}