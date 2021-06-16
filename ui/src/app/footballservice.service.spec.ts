/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { FootballserviceService } from './footballservice.service';

describe('Service: Footballservice', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [FootballserviceService]
    });
  });

  it('should ...', inject([FootballserviceService], (service: FootballserviceService) => {
    expect(service).toBeTruthy();
  }));
});
