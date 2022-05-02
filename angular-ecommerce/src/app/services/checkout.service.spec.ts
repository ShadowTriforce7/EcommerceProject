import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { CheckoutService } from './checkout.service';

describe('CheckoutService', () => {
  let service: CheckoutService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [CheckoutService]
    });
    //service = TestBed.inject(CheckoutService);
  });

  it('should be created', () => {
    service = TestBed.get(CheckoutService);
    expect(service).toBeTruthy();
  });
});
