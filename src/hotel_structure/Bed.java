package hotel_structure;

public enum Bed {

    BED_160 (160, 2),
    BED_140 (140, 2),
    BED_90 (90, 1);

    private final int bedSize;
    private final int bedSizeMaxPax;

    Bed(int bedSize, int bedSizeMaxPax) {
        this.bedSize = bedSize;
        this.bedSizeMaxPax = bedSizeMaxPax;
    }

    public int getBedSize() {
        return bedSize;
    }

    public int getBedSizeMaxPax() {
        return bedSizeMaxPax;
    }




}
