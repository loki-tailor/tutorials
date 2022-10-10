// import * as request from "request"; : IMPORTANT: this will fail as ..... is not a function
import request from "request";
import { Repo } from './Repo.js';
import { User } from './User.js';
const OPTIONS = {
    headers: { 'User-Agent': 'request' },
    json: true
};
export class GitHubApiService {
    // callback function of type user is 2n argument
    // getUserInfo ( uName: string, callbackFn: Function ) {
    // getUserInfo ( uName: string, callbackFn: ( u: any ) => any ) {
    getUserInfo(uName, callbackFn) {
        request.get(`https://api.github.com/users/${uName}`, OPTIONS, (err, res, body) => {
            // console.log( err );
            // console.log( res );
            const user = new User(body);
            // console.log( user );
            callbackFn(user);
        });
    }
    getRepos(usrObj, callbackFn) {
        request.get(`https://api.github.com/users/${usrObj.login}/repos`, OPTIONS, (err, res, body) => {
            // console.log( body );
            callbackFn(body.map((repo) => new Repo(repo)));
        });
    }
}
