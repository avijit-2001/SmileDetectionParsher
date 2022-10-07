import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RecordingParser fileParser = new RecordingParser("resources/RawDataCollection.txt");
        fileParser.parseRecording();
        Data data = fileParser.getDataNodes().get(0);
        SignalProcessor signalProcessor = new SignalProcessor();
        double[] chirp = signalProcessor.toArrayManual(data.getChirp());
        double[] direct = signalProcessor.toArrayManual(data.getDirect());
        double[] record = signalProcessor.toArrayManual(data.getRecord());
        signalProcessor.FourierTransform(chirp, direct, record);
    }
}