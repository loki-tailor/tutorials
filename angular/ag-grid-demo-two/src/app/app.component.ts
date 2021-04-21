import { Component } from '@angular/core';
// import { HttpClient, HttpHeaders } from '@angular/common/http';
import { GridReadyEvent } from 'ag-grid-community';

// import { DataService } from "services/data.service";
import { default as data } from '../data.json';
// import { ConfigService } from './config.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent {
  title = 'ag-grid-demo-two';
  private gridApi;
  private gridColumnApi;
  columnDefs: any;
  private sortingOrder;

  // constructor(
  //   private http: HttpClient) {}
  //   //  private dataservice: DataService) { }
  // // private configservice: ConfigService) 


  ngOnInit() {
    this.columnDefs = [
      {
        headerName: "Athlete",
        field: "athlete",
        width: 150,
        sortingOrder: ["asc", "desc"]
      },
      {
        headerName: "Age",
        field: "age",
        width: 150
      },
      {
        headerName: "Country",
        field: "country",
        width: 150
      },
      {
        headerName: "Year",
        field: "year",
        width: 150
      },
      {
        headerName: "Gold",
        field: "gold",
        width: 150
      },
      {
        headerName: "Silver",
        field: "silver",
        width: 150
      },
      {
        headerName: "Bronze",
        field: "bronze",
        width: 150
      },
      {
        headerName: "Total",
        field: "total",
        width: 150
      }
    ];
  }

  // using hard-coded ARRAY DATA
  // onGridReady(params) {
  //   this.gridApi = params.api;
  //   this.gridColumnApi = params.columnApi;
  //   let dataValues = [{ "firstName": "Lokeshwar", "age": 27 }, { "firstName": "Avengers", "age": 99 }]
  //   params.api.setRowData(dataValues)
  // }

  // using HTTP URL JSON
  // onGridReady(params) {
  //   this.gridApi = params.api;
  //   this.gridColumnApi = params.columnApi;
  //   this.http
  //     .get("https://raw.githubusercontent.com/ag-grid/ag-grid-docs/master/src/olympicWinners.json")
  //     .subscribe(data => {
  //       params.api.setRowData(data)
  //     })
  // }

  // USING IMPORT DATA_SERVICE
  // onGridReady = (params: GridReadyEvent) => {
  //   this.gridApi = params.api;
  //   this.gridColumnApi = params.columnApi;
  //   const data = this.dataservice.getData();
  //   this.gridApi.setRowData(data);
  // }

  // USING CONFIG_SERVICE
  // ref: https://dev.to/kylerjohnsondev/build-your-angular-app-once-deploy-anywhere-5ggk
  // onGridReady = (params: GridReadyEvent) => {
  //   this.gridApi = params.api;
  //   this.gridColumnApi = params.columnApi;
  //   const data = this.configservice.get_data();
  //   this.gridApi.setRowData(data);
  // }

  // USING IMPORT JSON
  onGridReady = (params: GridReadyEvent) => {
    this.gridApi = params.api;
    this.gridColumnApi = params.columnApi;
    this.gridApi.setRowData(data);
  }


  // USING CSV STORED LOCALLY (can be used for JSON also)
  // onGridReady(params) {

  //   this.gridApi = params.api;
  //   this.gridColumnApi = params.columnApi;

  //   // get csv data and convert to json obj
  //   let headers = new HttpHeaders().set("Access-Control-Allow-Origin", "*");
  //   this.http
  //     .get("../assets/data.csv", { headers, responseType: "text" })
  //     .subscribe(data => {

  //       // ref: https://stackoverflow.com/a/27979069/7415499

  //       // get all lines as array
  //       let lines = data.split("\n");

  //       // get column headings
  //       let headers = lines[0].split(",");

  //       let results = []

  //       // iterate over each line excluding headers
  //       for (let i = 1; i < lines.length; i++) {

  //         let obj = {}
  //         let currLine = lines[i].split(",");

  //         // iterate to generate each column data for this line
  //         for (let j = 0; j < headers.length; j++) {
  //           obj[headers[j].trim()] = currLine[j].trim();
  //         } // iteration end over columns

  //         // add object to json array
  //         results.push(obj);

  //       } // iteration end over lines

  //       params.api.setRowData(results);

  //     }) // subscribe end

  // } // onGrid-end

}// class end
