import { TestBed } from '@angular/core/testing';

import { DemoChildService } from './demo-child.service';

describe('DemoChildService', () => {
  let service: DemoChildService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DemoChildService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
