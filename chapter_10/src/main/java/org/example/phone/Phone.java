package org.example.phone;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Phone {

    private double taxRate;

    private Money amount;
    private Duration seconds;
    private List<Call> calls = new ArrayList<>();

    public Phone(double taxRate, Money amount, Duration seconds) {
        this.taxRate = taxRate;
        this.amount = amount;
        this.seconds = seconds;
    }

    public void call(Call call) {
        calls.add(call);
    }

    public Money getAmount() {
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(amount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
        }
        return result.plus(result.times(taxRate));
    }
}
