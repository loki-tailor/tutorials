import _ from "lodash";
import { GitHubApiService as gh } from "./GitHubApiService";
import { Repo } from "./Repo";
import { User } from "./User";

console.log( "hello" );

let svc = new gh()

if ( process.argv.length < 3 ) {
    console.log( 'please pass username as argument...' );
    process.exit( 1 );
}

const userName = process.argv[2]; // jwasham

svc.getUserInfo( userName, ( user: User ) => {

    svc.getRepos( user, ( repos: Repo[] ) => {
        const sortedRepos = _.sortBy( repos, [( repo ) => repo.forkCount * -1] )
        const top2 = _.take( sortedRepos, 2 );
        user.repos = top2;
        console.log( user )
    } )

} );


