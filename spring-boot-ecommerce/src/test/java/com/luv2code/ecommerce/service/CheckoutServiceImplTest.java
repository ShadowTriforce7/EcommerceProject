package com.luv2code.ecommerce.service;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.luv2code.ecommerce.dao.CustomerRepository;
import com.luv2code.ecommerce.dto.PaymentInfo;
import com.stripe.exception.StripeException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CheckoutServiceImpl.class, String.class})
@ExtendWith(SpringExtension.class)
class CheckoutServiceImplTest {
    @Autowired
    private CheckoutServiceImpl checkoutServiceImpl;

    @MockBean
    private CustomerRepository customerRepository;

    /**
     * Method under test: {@link CheckoutServiceImpl#createPaymentIntent(PaymentInfo)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreatePaymentIntent() throws StripeException {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("jane.doe@example.org");
        this.checkoutServiceImpl.createPaymentIntent(paymentInfo);
    }

    /**
     * Method under test: {@link CheckoutServiceImpl#createPaymentIntent(PaymentInfo)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreatePaymentIntent2() throws StripeException {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        PaymentInfo paymentInfo = mock(PaymentInfo.class);
        when(paymentInfo.getAmount()).thenReturn(10);
        when(paymentInfo.getCurrency()).thenReturn("GBP");
        when(paymentInfo.getReceiptEmail()).thenReturn("jane.doe@example.org");
        doNothing().when(paymentInfo).setAmount(anyInt());
        doNothing().when(paymentInfo).setCurrency((String) any());
        doNothing().when(paymentInfo).setReceiptEmail((String) any());
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("jane.doe@example.org");
        this.checkoutServiceImpl.createPaymentIntent(paymentInfo);
    }

    /**
     * Method under test: {@link CheckoutServiceImpl#createPaymentIntent(PaymentInfo)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreatePaymentIntent3() throws StripeException {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("jane.doe@example.org");
        this.checkoutServiceImpl.createPaymentIntent(paymentInfo);
    }

    /**
     * Method under test: {@link CheckoutServiceImpl#createPaymentIntent(PaymentInfo)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreatePaymentIntent4() throws StripeException {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        PaymentInfo paymentInfo = mock(PaymentInfo.class);
        when(paymentInfo.getAmount()).thenReturn(10);
        when(paymentInfo.getCurrency()).thenReturn("GBP");
        when(paymentInfo.getReceiptEmail()).thenReturn("jane.doe@example.org");
        doNothing().when(paymentInfo).setAmount(anyInt());
        doNothing().when(paymentInfo).setCurrency((String) any());
        doNothing().when(paymentInfo).setReceiptEmail((String) any());
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("jane.doe@example.org");
        this.checkoutServiceImpl.createPaymentIntent(paymentInfo);
    }

    /**
     * Method under test: {@link CheckoutServiceImpl#createPaymentIntent(PaymentInfo)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreatePaymentIntent5() throws StripeException {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("jane.doe@example.org");
        this.checkoutServiceImpl.createPaymentIntent(paymentInfo);
    }

    /**
     * Method under test: {@link CheckoutServiceImpl#createPaymentIntent(PaymentInfo)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreatePaymentIntent6() throws StripeException {
        // TODO: Complete this test.
        //   Reason: R011 Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access the network.
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        PaymentInfo paymentInfo = mock(PaymentInfo.class);
        when(paymentInfo.getAmount()).thenReturn(10);
        when(paymentInfo.getCurrency()).thenReturn("GBP");
        when(paymentInfo.getReceiptEmail()).thenReturn("jane.doe@example.org");
        doNothing().when(paymentInfo).setAmount(anyInt());
        doNothing().when(paymentInfo).setCurrency((String) any());
        doNothing().when(paymentInfo).setReceiptEmail((String) any());
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("jane.doe@example.org");
        this.checkoutServiceImpl.createPaymentIntent(paymentInfo);
    }
}

