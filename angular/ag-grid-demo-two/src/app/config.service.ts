import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})
export class ConfigService {

    private configuration: any;

    constructor(
        private httpClient: HttpClient
    ) { }

    set_data(): Promise<any> {
        return this.httpClient
            .get<any>('./data.json')
            .toPromise()
            .then(config => this.configuration = config);
    }

    get_data = () => {
        return this.configuration;
    }
}
