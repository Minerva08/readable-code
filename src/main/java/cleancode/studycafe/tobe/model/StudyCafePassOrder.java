package cleancode.studycafe.tobe.model;

import cleancode.studycafe.tobe.model.pass.StudyCafeSeatPass;
import cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPass;
import java.util.Optional;

public class StudyCafePassOrder {

    private final StudyCafeSeatPass studyCafeSeatPass;
    private final StudyCafeLockerPass studyCafeLockerPass;

    public StudyCafePassOrder(StudyCafeSeatPass studyCafeSeatPass,
        StudyCafeLockerPass studyCafeLockerPass) {
        this.studyCafeSeatPass = studyCafeSeatPass;
        this.studyCafeLockerPass = studyCafeLockerPass;
    }

    public static StudyCafePassOrder of(StudyCafeSeatPass seatPass, StudyCafeLockerPass lockerPass){
        return new StudyCafePassOrder(seatPass,lockerPass);
    }

    public StudyCafeSeatPass getSeatPass() {
        return this.studyCafeSeatPass;
    }

    public Optional<StudyCafeLockerPass> getStudyCafeLockerPass() {
        return Optional.ofNullable(studyCafeLockerPass);
    }


    public int getDiscountPrice() {
        return studyCafeSeatPass.getDiscountPrice();
    }

    public int getTotalPrice() {

        int lockerPassPrice = studyCafeSeatPass != null ? studyCafeLockerPass.getPrice() : 0;
        int totalPrice = lockerPassPrice+studyCafeSeatPass.getPrice();

        return totalPrice - getDiscountPrice();
    }
}
