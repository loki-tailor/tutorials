import { Injectable } from '@angular/core';
import { default as data } from './data.json';

@Injectable({
    providedIn: "root"
})
export class DataService {
    constructor() { }
    getData = () => data
    get_data_from_csv = () => {
        
        return data;
    }
}
