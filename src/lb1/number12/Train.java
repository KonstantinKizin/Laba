package lb1.number12;

public class Train {

    private String destination;
    private String trainNumber;
    private String dispatchTime;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(String dispatchTime) {
        this.dispatchTime = dispatchTime;
    }


    @Override
    public String toString() {
        return "lb1.number12.Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber='" + trainNumber + '\'' +
                ", dispatchTime='" + dispatchTime + '\'' +
                '}';
    }
}
