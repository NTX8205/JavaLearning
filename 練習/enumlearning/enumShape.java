package 練習.enumlearning;


public enum enumShape {
    A(2, 1), B(5, 4), C(8, 5), D(3, 4);

    private final int Width;
    private final int Long;

    enumShape(int Long,int width){
		this.Long=Long;
		this.Width= width;
	}

    // private double Width() {
    //     return Width;
    // }

    // private double Long() {
    //     return Long;
    // }

    int area() {
        return Width * Long;
    }

    int perimeter() {
        return 2 * (Width + Long);
    }

    public static void main(String[] args) {

        for (enumShape s : enumShape.values())
            System.out.printf("%s Shape area is %d ,perimeter is %d%n", s, s.area(), s.perimeter());

    }

}
