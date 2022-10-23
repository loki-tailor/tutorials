// reason this file is .mts extension instead of .ts
// ref @ https://stackoverflow.com/questions/58273824/typescript-cannot-use-import-statement-outside-a-module

import { Formatter } from 'cucumber-json-report-formatter';

const formatter = new Formatter();
const sourceFile = './cypress/results/cucumber-messages.ndjson';
const outputFile = './cypress/results/cucumber-report.json';
await formatter.parseCucumberJson(sourceFile, outputFile);
