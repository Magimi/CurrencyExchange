package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class InterfaceController {

    public static double In;
    public static double Out;
    public static String currency;

    @FXML
    public void initialize() {
    }

    @FXML
    private TextArea dolarIn;
    @FXML
    private TextArea dolarOut;
    @FXML
    private TextArea euroIn;
    @FXML
    private TextArea euroOut;
    @FXML
    private TextArea poundIn;
    @FXML
    private TextArea poundOut;
    @FXML
    private TextArea audIn;
    @FXML
    private TextArea audOut;
    @FXML
    private TextArea yenIn;
    @FXML
    private TextArea yenOut;
    @FXML
    private TextArea frankIn;
    @FXML
    private TextArea frankOut;
    @FXML
    private TextArea cadIn;
    @FXML
    private TextArea cadOut;

    public void textOut(){
        if(currency.equals("dolar")) {
            dolarOut.setText("" + Out);
        }else if(currency.equals("euro")) {
            euroOut.setText("" + Out);
        }else if(currency.equals("pound")) {
            poundOut.setText("" + Out);
        }else if(currency.equals("aud")) {
            audOut.setText("" + Out);
        }else if(currency.equals("yen")) {
            yenOut.setText("" + Out);
        }else if(currency.equals("frank")) {
            frankOut.setText("" + Out);
        }else if(currency.equals("cad")) {
            cadOut.setText("" + Out);
        }
    }
    public void exchangeValue(){
        if(currency.equals("dolar")){
            Out = In * 3.568;
        }else if(currency.equals("euro")){
            Out = In * 4.252;
        }else if(currency.equals("pound")){
            Out = In * 4.803;
        }else if(currency.equals("aud")){
            Out = In * 2.684;
        }else if(currency.equals("yen")){
            Out = In * 3.266;
        }else if(currency.equals("frank")){
            Out = In * 3.558;
        }else if(currency.equals("cad")){
            Out = In * 2.773;
        }
    }

    @FXML
    public void dolarExchange() {
        try {
            currency = "dolar";
            String dolar = dolarIn.getText();
            In = Double.parseDouble(dolar);
            exchangeValue();
            textOut();

        } catch (NumberFormatException exception) {
            textOut();
        }
    }
    @FXML
    public void euroExchange() {
        try {
            currency = "euro";
            String euro = euroIn.getText();
            In = Double.parseDouble(euro);
            exchangeValue();
            textOut();

        } catch (NumberFormatException exception) {
            textOut();
        }
    }
    @FXML
    public void poundExchange() {
        try {
            currency = "pound";
            String pound = poundIn.getText();
            In = Double.parseDouble(pound);
            exchangeValue();
            textOut();

        } catch (NumberFormatException exception) {
            textOut();
        }
    }
    @FXML
    public void audExchange() {
        try {
            currency = "aud";
            String aud = audIn.getText();
            In = Double.parseDouble(aud);
            exchangeValue();
            textOut();

        } catch (NumberFormatException exception) {
            textOut();
        }
    }
    @FXML
    public void yenExchange() {
        try {
            currency = "yen";
            String yen = yenIn.getText();
            In = Double.parseDouble(yen);
            exchangeValue();
            textOut();

        } catch (NumberFormatException exception) {
            textOut();
        }
    }
    @FXML
    public void frankExchange() {
        try {
            currency = "frank";
            String frank = frankIn.getText();
            In = Double.parseDouble(frank);
            exchangeValue();
            textOut();

        } catch (NumberFormatException exception) {
            textOut();
        }
    }
    @FXML
    public void cadExchange() {
        try {
            currency = "cad";
            String cad = cadIn.getText();
            In = Double.parseDouble(cad);
            exchangeValue();
            textOut();

        } catch (NumberFormatException exception) {
            textOut();
        }
    }
}


