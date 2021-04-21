import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'my-app';

  columnDefs = [
    { headerName: "Make", field: "make", sortable: true, filter: true, checboxSelection: true },
    { headerName: "Model", field: "model", sortable: true, filter: true },
    { headerName: "Price", field: "price", sortable: true, filter: true }
  ]

  rowData = [
    { make: "Toyato", model: "Celica", price: 123434 },
    { make: "Ford", model: "Indigo", price: 45435 } ,
    { make: "Porche", model: "Boxter", price: 90808 },
  ]
}
