import { Component } from '@angular/core';
import { default as file_data } from '../assets/data.json';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'angular-demo-three';

  public results = [];
  
  constructor() {
    this.generate_json();
  }

  rowData = this.results;

  columnDefs = [
    {
      headerName: 'Athlete',
      field: 'athlete',
      width: 150,
      sortingOrder: ['asc', 'desc'],
    },
    {
      headerName: 'Age',
      field: 'age',
      width: 150,
    },
    {
      headerName: 'Country',
      field: 'country',
      width: 150,
    },
    {
      headerName: 'Year',
      field: 'year',
      width: 150,
    },
    {
      headerName: 'Gold',
      field: 'gold',
      width: 150,
    },
    {
      headerName: 'Silver',
      field: 'silver',
      width: 150,
    },
    {
      headerName: 'Bronze',
      field: 'bronze',
      width: 150,
    },
    {
      headerName: 'Total',
      field: 'total',
      width: 150,
    },
  ];

  public generate_json() {
    // get all lines as array
    let lines = file_data[0].split('|');

    // get column headings
    let headers = lines[0].split(',');

    // iterate over each line excluding headers
    for (let i = 1; i < lines.length; i++) {
      let obj = {};
      let currLine = lines[i].split(',');

      // iterate to generate each column data for this line
      for (let j = 0; j < headers.length; j++) {
        obj[headers[j].trim()] = currLine[j].trim();
      } // iteration end over columns

      // add object to json array
      this.results.push(obj);
    } // iteration end over lines
  }
}
