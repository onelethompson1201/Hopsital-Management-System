/* Medication.java
 Entity for the Medication
 Author: Onele Tomson (219483280)
 Date: 08 May 2022
*/

package za.ac.cput.Entity;

public class Medication {

    private String medicationID;
    private String medicationName;
    private float medicationPrice;
    private int medicationQuantity;

    private Medication(Builder builder) {
        this.medicationID = builder.medicationID;
        this.medicationName = builder.medicationName;
        this.medicationPrice = builder.medicationPrice;
        this.medicationQuantity = builder.medicationQuantity;
    }

    public String getMedicationID() {
        return medicationID;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public float getMedicationPrice() {
        return medicationPrice;
    }

    public int getMedicationQuantity() {
        return medicationQuantity;
    }

    public void setMedicationID(String medicationID) {
        this.medicationID = medicationID;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public void setMedicationPrice(float medicationPrice) {
        this.medicationPrice = medicationPrice;
    }

    public void setMedicationQuantity(int medicationQuantity) {
        this.medicationQuantity = medicationQuantity;
    }



    @Override
    public String toString() {
        return "Medication{" +
                "medicationID='" + medicationID + '\'' +
                ", medicationName='" + medicationName + '\'' +
                ", medicationPrice=" + medicationPrice +
                ", medicationQuantity=" + medicationQuantity +
                '}';
    }

    public static class Builder {
        private String medicationID;
        private String medicationName;
        private float medicationPrice;
        private int medicationQuantity;

        public Builder setMedicationID(String medicationID) {
            this.medicationID = medicationID;
            return this;
        }

        public Builder setMedicationName(String medicationName) {
            this.medicationName = medicationName;
            return this;
        }

        public Builder setMedicationPrice(float medicationPrice) {
            this.medicationPrice = medicationPrice;
            return this;
        }

        public Builder setMedicationQuantity(int medicationQuantity) {
            this.medicationQuantity = medicationQuantity;
            return this;
        }


        public Builder copy(Medication medication) {
            this.medicationID = medication.medicationID;
            this.medicationName = medication.medicationName;
            this.medicationPrice = medication.medicationPrice;
            this.medicationQuantity = medication.medicationQuantity;
            return this;
        }
        public Medication build() {
            return new Medication(this);
        }
    }

}
