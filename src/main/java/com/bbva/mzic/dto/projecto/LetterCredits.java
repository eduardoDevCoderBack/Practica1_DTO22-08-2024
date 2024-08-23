package com.bbva.mzic.dto.projecto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The ExampleDTO class...
 */
public class LetterCredits implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	private String letter;
    private String reference;
    private int sequence;
    private List<Banks> banks;
    private Costumer costumer;


	public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public List<Banks> getBanks() {
        return banks;
    }

    public void setBanks(List<Banks> banks) {
        this.banks = banks;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }
	

	@Override
    public boolean equals(final Object obj) {
        if (obj == null) { return false; }
        if (obj == this) { return true; }
        if (obj.getClass() != getClass()) {
            return false;
        }
        final LetterCredits rhs = (LetterCredits) obj;
        return new EqualsBuilder()
            .appendSuper(super.equals(obj))
            .append(letter, rhs.letter)
            .append(reference, rhs.reference)
            .append(sequence, rhs.sequence)
            .append(banks, rhs.banks)
            .append(costumer, rhs.costumer)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
            .append(letter)
            .append(reference)
            .append(sequence)
            .append(banks)
            .append(costumer)
            .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("letter", letter)
            .append("reference", reference)
            .append("sequence", sequence)
            .append("banks", banks)
            .append("costumer", costumer)
            .toString();
    }
}
