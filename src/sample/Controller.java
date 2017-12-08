package sample;

import javafx.animation.PathTransition;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.lang.String;
import java.math.BigInteger;



public class Controller implements Converstion {
    @FXML
    Circle circle;
    @FXML
    ScrollPane pane;
    @FXML
    ScrollPane pane1;
    @FXML
    Circle circle1;
    @FXML
    Button pause;
    @FXML
    Button pause1;
    @FXML
    Button resume;
    @FXML
    Button resume1;
    @FXML
    Label application;
    @FXML
    Label physicallayer;
    @FXML
    Label physicallayer1;
    @FXML
    Label application1;
    @FXML
    TextField textField1;
    @FXML
    TextArea textbottom;
    @FXML
    TextArea textbottom1;
    @FXML
    TextArea textup;
    @FXML
    Label datalink;
    @FXML
    Label datalink1;
    @FXML
    Label networklayer;
    @FXML
    Label transportlayer;
    @FXML
    Label transportlayer1;
    @FXML
    Label networklayer1;
    @FXML
    Label sessionlayer;
    @FXML
    Label sessionlayer1;
    @FXML
    Label presentationlayer;
    @FXML
    Label presentationlayer1;
    @FXML
    Label label1;
    @FXML
    Label label2;
    @FXML
    Label label3;
    @FXML
    Label label4;
    @FXML
    Label label5;
    @FXML
    Label label6;
    @FXML
    Label label7;
    @FXML
    Label label8;
    @FXML
    Label label9;
    @FXML
    Label label10;
    @FXML
    Label label11;



    IPDatagram ipDatagram1 =new IPDatagram();
    Transport_Layer transport_layer = new Transport_Layer();
    String SourceAddress = "8000207A3F3E";
    String DestinationAddress = "800020203AAE";
    private final int[] divisor = new int[] {1, 0, 1, 1};
    String a = "01100001";
    String  b = "0000";
    Color c = Color.grayRgb(3);
    String binary = "01100001";




    String a1 = transport_layer.getSource_port()+transport_layer.getDestination_port()+transport_layer.getSequencee_number()+transport_layer.getAck_number()+transport_layer.getTcp_header()+transport_layer.getUnused()+transport_layer.getWindow_size()+transport_layer.getChecksum()+transport_layer.getUrgent_pointer()+transport_layer.getOption()+transport_layer.getData()+hexToBin(SourceAddress)+hexToBin(DestinationAddress)+ipDatagram1.getFlags()+ipDatagram1.getDestinationAddressBinary()+ipDatagram1.getIdentification();


    @FXML

    public void OnButtonClick() {
        Path path = new Path();
        Path path1 = new Path();

        MoveTo moveTo = new MoveTo(0, 0);
        LineTo line1 = new LineTo(0, 350);
        LineTo line2 = new LineTo(155, 350);
        LineTo line3 = new LineTo(240, 200);
        LineTo line4 = new LineTo(670, 200);
        LineTo line5 = new LineTo(700, 300);
        LineTo line6 = new LineTo(750, 300);
        LineTo line7 = new LineTo(750, 0);


        MoveTo moveTo1 = new MoveTo(0, 0);
        LineTo line1_1 = new LineTo(0, 350);
        LineTo line2_1 = new LineTo(246, 373);
        LineTo line3_1 = new LineTo(300, 450);
        LineTo line4_1 = new LineTo(380, 350);
        LineTo line5_1 = new LineTo(580, 350);
        LineTo line6_1 = new LineTo(650, 450);
        LineTo line7_1 = new LineTo(690, 450);
        LineTo line8_1 = new LineTo(735, 340);
        LineTo line9_1 = new LineTo(810, 340);
        LineTo line10_1 = new LineTo(820, 0);


        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2,line3,line4,line5,line6,line7);
        PathTransition pathTransition = new PathTransition();

        path1.getElements().add(moveTo1);
        path1.getElements().addAll(line1_1,line2_1,line3_1,line4_1,line5_1,line6_1,line7_1,line8_1,line9_1,line10_1);
        PathTransition pathTransition1 = new PathTransition();

        pathTransition.setDuration(Duration.millis(20000));
        pathTransition.setNode(circle);
        pathTransition.setPath(path);

        pathTransition1.setDuration(Duration.millis(20000));
        pathTransition1.setNode(circle1);
        pathTransition1.setPath(path1);


        pause.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {

                pathTransition.pause();
            }
        }));

        resume.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {

                pathTransition1.pause();
            }
        }));




        circle.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {

                pathTransition.play();
            }
        }));



        circle1.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {

                pathTransition1.play();
            }
        }));







        pathTransition.setAutoReverse(false);
        pathTransition.play();

        pathTransition1.setAutoReverse(false);
        pathTransition1.play();


    }





    public String ApplicationLayer() {
        String s = textField1.getText();
        application.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom.disabledProperty();
                textbottom.setText("Application Layer:  " + s);
                textbottom.appendText("\n");
            }
        }));
        return s;
    }
    public String ApplicationLayer1() {
        String s = textField1.getText();
        application1.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textup.disabledProperty();
                textup.setText("Application Layer:  " + s);
                textup.appendText("\n");
            }
        }));
        return s;
    }
    public void PresentationLayer1() {

        presentationlayer1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom1.disabledProperty();
                textbottom1.setText("Presentation Layer:The presentation layer is layer 6 of the 7-layer Open Systems Interconnection (OSI) model. It is used to present data to the application layer (layer 7) in an accurate, well-defined and standardized format. The presentation layer is sometimes called the syntax layer." +"\n");
                textbottom1.appendText("\n");
            }
        });
    }
    public void PresentationLayer() {

        presentationlayer.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom.disabledProperty();
                textbottom.setText("Presentation Layer:The presentation layer is layer 6 of the 7-layer Open Systems Interconnection (OSI) model. It is used to present data to the application layer (layer 7) in an accurate, well-defined and standardized format. The presentation layer is sometimes called the syntax layer." +"\n");
                textbottom.appendText("\n");
            }
        });
    }

    public void SessionLayer1() {

        sessionlayer1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom1.disabledProperty();
                textbottom1.setText("Session Layer:In the seven-layer OSI model of computer networking, the session layer is layer 5. The session layer provides the mechanism for opening, closing and managing a session between end-user application processes, i.e., a semi-permanent dialogue." +"\n");
                textbottom1.appendText("\n");
            }
        });
    }
    public void SessionLayer() {

        sessionlayer.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom.disabledProperty();
                textbottom.setText("Session Layer:In the seven-layer OSI model of computer networking, the session layer is layer 5. The session layer provides the mechanism for opening, closing and managing a session between end-user application processes, i.e., a semi-permanent dialogue." +"\n");
                textbottom.appendText("\n");
            }
        });
    }



    public void TransportLayer1() {
        Transport_Layer transport_layer = new Transport_Layer();
        transportlayer1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom1.disabledProperty();
                textbottom1.setText("Transport Layer:" +"\n"+""+"Source Port:  "+transport_layer.getSource_port() +"\n"+""+"Destination Port: "+transport_layer.getDestination_port() +"\n" +""+"Sequence number: "+transport_layer.getSequencee_number() +"\n" +""+"Acknowledgement: "+transport_layer.getAck_number() +"\n"+""+"Header length: "+transport_layer.getTcp_header() +"\n"+""+"Unused: "+transport_layer.getUnused() +"\n"+"Window size: "+transport_layer.getWindow_size() +"\n"+"" +"Checksum: "+transport_layer.getChecksum()+"\n"+"" +"Urgent Pointer: "+transport_layer.getUrgent_pointer() +"\n"+"" +"Option: "+transport_layer.getOption() +"\n"+"" +"Data: "+transport_layer.getData() );
                textbottom1.appendText("\n");
            }
        });
    }

    public void TransportLayer() {
        Transport_Layer transport_layer = new Transport_Layer();
        transportlayer.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom.disabledProperty();
                textbottom.setText("Transport Layer:" +"\n"+""+"Source Port:  "+transport_layer.getSource_port() +"\n"+""+"Destination Port: "+transport_layer.getDestination_port() +"\n" +""+"Sequence number: "+transport_layer.getSequencee_number() +"\n" +""+"Acknowledgement: "+transport_layer.getAck_number() +"\n"+""+"Header length: "+transport_layer.getTcp_header() +"\n"+""+"Unused: "+transport_layer.getUnused() +"\n"+"Window size: "+transport_layer.getWindow_size() +"\n"+"" +"Checksum: "+transport_layer.getChecksum()+"\n"+"" +"Urgent Pointer: "+transport_layer.getUrgent_pointer() +"\n"+"" +"Option: "+transport_layer.getOption() +"\n"+"" +"Data: "+transport_layer.getData() );
                textbottom.appendText("\n");
            }
        });
    }
    public void NetworkLayer1() {
        IPDatagram ipDatagram = new IPDatagram();
        networklayer1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom1.disabledProperty();
                textbottom1.setText("Network Layer: Ip datagram  " +"\n"+""+"Version:  "+ipDatagram.getVersion() +"\n"+""+"Header: "+ipDatagram.getHeader() +"\n" +""+"Tos: "+ipDatagram.getTos() +"\n" +""+"Totallength: "+ipDatagram.getTotalLengt() +"\n"+""+"Identification: "+ipDatagram.getIdentification() +"\n"+""+"Flag: "+ipDatagram.getFlags() +"\n"+"FragmentOffest: "+ipDatagram.getFragmentOffset() +"\n"+"" +"Tol: "+ipDatagram.getTol()+"\n"+"" +"Protocol: "+ipDatagram.getProtocol() +"\n"+"" +"Source Address Binary: "+ipDatagram.getSourceAddressBinary() +"\n"+"" +"Destination Address Binary: "+ipDatagram.getDestinationAddressBinary() );
                textbottom1.appendText("\n");
            }
        });
    }
    public void NetworkLayer() {
        IPDatagram ipDatagram = new IPDatagram();
        networklayer.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom.disabledProperty();
                textbottom.setText("Network Layer: Ip datagram  " +"\n"+""+"Version:  "+ipDatagram.getVersion() +"\n"+""+"Header: "+ipDatagram.getHeader() +"\n" +""+"Tos: "+ipDatagram.getTos() +"\n" +""+"Totallength: "+ipDatagram.getTotalLengt() +"\n"+""+"Identification: "+ipDatagram.getIdentification() +"\n"+""+"Flag: "+ipDatagram.getFlags() +"\n"+"FragmentOffest: "+ipDatagram.getFragmentOffset() +"\n"+"" +"Tol: "+ipDatagram.getTol()+"\n"+"" +"Protocol: "+ipDatagram.getProtocol() +"\n"+"" +"Source Address Binary: "+ipDatagram.getSourceAddressBinary() +"\n"+"" +"Destination Address Binary: "+ipDatagram.getDestinationAddressBinary() );
                textbottom.appendText("\n");
            }
        });
    }



    public void DataLinkLayer() {
        //String s = textField1.getText();
        String preamble = "10101010";
        String p = "";
        String StartFrame = "10101011";
        for (int i = 1; i <= 7; i++) {
            p = p + preamble;
        }
        String finalP = p;
       // String frame = finalP+StartFrame+hexToBin(SourceAddress)+hexToBin(DestinationAddress)+strToBin()+padinding()+getCRCBits(a);


        datalink.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom.disabledProperty();
                 textbottom.setText("DataLink Layer: Ethernet Frame  " +"\n"+""+"Preamble:  "+finalP +"\n"+""+"Start Frame: "+StartFrame +"\n" +""+"DestinationAddress: "+hexToBin1(DestinationAddress) +"\n" +""+"SourceAddress: "+hexToBin(SourceAddress) +"\n"+""+"Data: "+strToBin() +"\n"+""+"Padding: "+padinding() +"\n"+"CRC: "+getCRCBits(a) +"\n"     +"" +"Complete Frame: "+finalP+StartFrame+hexToBin1(DestinationAddress)+hexToBin(SourceAddress)+strToBin()+padinding()+getCRCBits(a));
                //textbottom.setText("" +convertBinaryToArray(ApplicationLayer(),3));

                textbottom.appendText("\n");

            }
        }));

    }

    public void DataLinkLayer1() {
        //String s = textField1.getText();
        String preamble = "10101010";
        String p = "";
        String StartFrame = "10101011";
        for (int i = 1; i <= 7; i++) {
            p = p + preamble;
        }
        String finalP = p;


        datalink1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom1.disabledProperty();
                 textbottom1.setText("DataLink Layer: Ethernet Frame  " +"\n"+""+"Preamble:  "+finalP +"\n"+""+"Start Frame: "+StartFrame +"\n" +""+"DestinationAddress: "+hexToBin1(DestinationAddress) +"\n" +""+"SourceAddress: "+hexToBin(SourceAddress) +"\n"+""+"Data: "+strToBin() +"\n"+""+"Padding: "+padinding() +"\n"+"CRC: "+b +"\n"+"" +"Complete Frame: "+finalP+StartFrame+hexToBin1(DestinationAddress)+hexToBin(SourceAddress)+strToBin()+padinding()+b);
                textbottom1.appendText("\n");

            }
        });

    }

    public void physicallayer(){
        physicallayer.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom.disabledProperty();
                pane.setContent(drawDigitalSignal(a1,c));
                pane1.setContent(drawAnalogSignal(a1,c));

                textbottom.appendText("\n");

            }
        });
    }
    public void physicallayer1(){
        physicallayer1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textbottom.disabledProperty();
                pane.setContent(drawDigitalSignal(a1,c));
                pane1.setContent(drawAnalogSignal(a1,c));

                textbottom.appendText("\n");

            }
        });
    }





    @Override
    public String hexToBin(String SourceAddress) {

        return new BigInteger(SourceAddress, 16).toString(2);
    }

    @Override
    public String hexToBin1(String DestinationAddress) {
        return new BigInteger(DestinationAddress, 16).toString(2);
    }

    @Override
    public String strToBin() {
        String pav = ApplicationLayer();
        String bs=pav;

        byte[] bytes = bs.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        System.out.println("'" + bs + "' to binary: " + binary);
        String a = String.valueOf(binary);
        return a;
    }



    @Override
    public String padinding() {
        String pading = "00000000";
        String x = "";
        for (int i = 1; i <= 45; i++) {

            x = x + pading;
        }

        return x;
    }

    public String getCRCBits(String binary) {
        int number_of_zeros = divisor.length - 1;
        int data[] = convertBinaryToArray(binary, number_of_zeros);
        int reminder[] = longDivision(divisor, data);
        StringBuilder rem = new StringBuilder();
        for(int i=0;i<reminder.length;i++){
            rem.append(reminder[i]);
        }
        return rem.toString();
    }

     public int[] convertBinaryToArray(String binary, int num_zero) {
        int data[] = new int[binary.length() + num_zero];
        for (int i = 0; i < data.length; i++) {
            if (i < binary.length()) {
                data[i] = Integer.parseInt(String.valueOf(binary.charAt(i)));
            } else {
                data[i] = 0;
            }
        }
        return data;
    }

    private int[] longDivision(int[] divisor, int[] data) {
        int dataLength = data.length - divisor.length + 1;
        int reminder[] = new int[data.length];
        int temp[] = new int[divisor.length];

        for (int i = 0; i < data.length; i++) {
            reminder[i] = data[i];
        }
        for (int i = 0; i < dataLength; i++) {
            int msb = reminder[i];
            int sum = 0;
            for (int k = 0; k < divisor.length; k++) {
                if (msb == 0) {
                    temp[k] = 0;
                } else {
                    temp[k] = divisor[k];
                }
            }
            for (int j = i; j < divisor.length + i; j++) {
                reminder[j] = xor(reminder[j], temp[sum]);
                sum++;
            }
        }

        return reminder;
    }

    private int xor(int x, int y) {
        return (x == y) ? 0 : 1;
    }





    private Pane drawDigitalSignal(String binary, Color c) {
        Pane signalPane = new Pane();
        signalPane.setPrefSize(binary.length() * 100, 150);

        double StartX = 50;
        double StartText = 60;
        try {

            for (int i = 0; i < binary.length(); i++) {
                Polyline lineDown = new Polyline(StartX, 100, StartX + 30, 100);
                lineDown.setStrokeWidth(3);
                lineDown.setStroke(c);
                Polyline lineUp = new Polyline(StartX, 40, StartX + 30, 40);
                lineUp.setStrokeWidth(3);
                lineUp.setStroke(c);
                Polyline lineLeft = new Polyline(StartX, 100, StartX, 40, StartX + 30, 40);
                lineLeft.setStrokeWidth(3);
                lineLeft.setStroke(c);
                Polyline lineRight = new Polyline(StartX, 40, StartX + 30, 40, StartX + 30, 100);
                lineRight.setStrokeWidth(3);
                lineRight.setStroke(c);
                Polyline lineRect = new Polyline(StartX, 100, StartX, 40, StartX + 30, 40, StartX + 30, 100);
                lineRect.setStrokeWidth(3);
                lineRect.setStroke(c);
                if (binary.charAt(i) == '0') {
                    Text textZero = new Text(StartText, 20, "0");
                    textZero.setStroke(c);
                    textZero.setStrokeWidth(2);
                    signalPane.getChildren().add(textZero);
                    signalPane.getChildren().add(lineDown);
                    StartX += 30;
                    StartText += 30;
                } else if (binary.charAt(i) == '1') {
                    Text textOne = new Text(StartText, 20, "1");
                    textOne.setStroke(c);
                    textOne.setStrokeWidth(2);
                    signalPane.getChildren().add(textOne);
                    StartText += 30;
                    if (i == 0) {
                        if (binary.charAt(i + 1) == '1') {
                            signalPane.getChildren().add(lineLeft);

                        } else if (binary.charAt(i + 1) == '0') {
                            signalPane.getChildren().add(lineRect);
                        }
                    } else if (i == binary.length() - 1) {
                        if (binary.charAt(i - 1) == '1') {
                            signalPane.getChildren().add(lineRight);
                        } else if (binary.charAt(i - 1) == '0') {
                            signalPane.getChildren().add(lineRect);
                        }
                    } else if (binary.charAt(i - 1) == '0' && binary.charAt(i + 1) == '1') {
                        signalPane.getChildren().add(lineLeft);
                    } else if (binary.charAt(i - 1) == '1' && binary.charAt(i + 1) == '0') {
                        signalPane.getChildren().add(lineRight);
                    } else if (binary.charAt(i - 1) == '1' && binary.charAt(i + 1) == '1') {
                        signalPane.getChildren().add(lineUp);
                    } else {
                        signalPane.getChildren().add(lineRect);
                    }
                    StartX += 30;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return signalPane;
    }

    private Pane drawAnalogSignal(String binary, Color c) {
        double StartX = 50;
        double StartY = 80;
        double StartText = 80;
        Pane signalPane = new Pane();
        signalPane.setPrefSize(binary.length() * 150, 150);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                Text textZero = new Text(StartText, 20, "0");
                textZero.setStroke(c);
                textZero.setStrokeWidth(2);
                signalPane.getChildren().add(textZero);
                StartText += 80;
                for (int j = 0; j < 2; j++) {
                    Arc up = new Arc();
                    up.setCenterX(StartX);
                    up.setCenterY(StartY);
                    up.setRadiusX(10);
                    up.setRadiusY(40);
                    up.setStartAngle(0);
                    up.setLength(180);
                    up.setType(ArcType.OPEN);
                    up.setStroke(c);
                    up.setStrokeWidth(3);
                    up.setFill(Color.TRANSPARENT);
                    signalPane.getChildren().add(up);
                    StartX += 20;
                    Arc down = new Arc();
                    down.setCenterX(StartX);
                    down.setCenterY(StartY);
                    down.setRadiusX(10);
                    down.setRadiusY(40);
                    down.setStartAngle(180);
                    down.setLength(180);
                    down.setType(ArcType.OPEN);
                    down.setStroke(c);
                    down.setStrokeWidth(3);
                    down.setFill(Color.TRANSPARENT);
                    signalPane.getChildren().add(down);
                    StartX += 20;
                }

            } else if (binary.charAt(i) == '1') {

                Text textOne = new Text(StartText, 20, "1");
                textOne.setStroke(c);
                textOne.setStrokeWidth(2);
                signalPane.getChildren().add(textOne);
                StartText += 120;
                StartX -= 5;
                for (int j = 0; j < 6; j++) {
                    Arc Oneup = new Arc();
                    Oneup.setCenterX(StartX);
                    Oneup.setCenterY(StartY);
                    Oneup.setRadiusX(5);
                    Oneup.setRadiusY(40);
                    Oneup.setStartAngle(0);
                    Oneup.setLength(180);
                    Oneup.setType(ArcType.OPEN);
                    Oneup.setStroke(c);
                    Oneup.setStrokeWidth(3);
                    Oneup.setFill(Color.TRANSPARENT);
                    signalPane.getChildren().add(Oneup);
                    StartX += 10;

                    Arc Onedown = new Arc();
                    Onedown.setCenterX(StartX);
                    Onedown.setCenterY(StartY);
                    Onedown.setRadiusX(5);
                    Onedown.setRadiusY(40);
                    Onedown.setStartAngle(180);
                    Onedown.setLength(180);
                    Onedown.setType(ArcType.OPEN);
                    Onedown.setStroke(c);
                    Onedown.setStrokeWidth(3);
                    Onedown.setFill(Color.TRANSPARENT);
                    signalPane.getChildren().add(Onedown);
                    StartX += 10;

                }
                StartX += 5;
            }
        }
        return signalPane;
    }






    }












