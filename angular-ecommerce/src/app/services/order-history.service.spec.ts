import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { OrderHistoryService } from './order-history.service';

describe('OrderHistoryService', () => {
  let service: OrderHistoryService;

  beforeEach(() => {
    TestBed.configureTestingModule({ 
      imports: [HttpClientTestingModule],
      providers: [OrderHistoryService]});
    //service = TestBed.inject(OrderHistoryService);
  });

  it('should be created', () => {
    service = TestBed.get(OrderHistoryService);
    expect(service).toBeTruthy();
  });
});
