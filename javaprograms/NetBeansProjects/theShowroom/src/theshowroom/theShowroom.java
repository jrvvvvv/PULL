    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theshowroom;

/**
 *
 * @author JRV
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.swing.ImageIcon.*;

public class theShowroom implements ActionListener {
    

    /**
     * @param args the command line arguments
     */
     JFrame introFrame,menuFrame,carsFrame,motorsFrame
             ,sedanFrame,SUVFrame,vanFrame
             ,underboneFrame,scooterFrame
             ,orderformFrame;
     
     JPanel backgroundMenu,backgroundCars,backgroundMotors,background
             ,backgroundSedan,backgroundSUV,backgroundVan
                     ,backgroundUnderbone,backgroundScooter
             ,orderformBackground;
     
     JLabel backgroundgif,userlabel,passlabel,nameAccMenu,nameAccCars,nameAccMotors,nameAccSedan,nameAccSUV,nameAccVan,nameAccUnderbone,nameAccScooter,
             logoMenu,carsLabel,showroomLogoCars,showroomLogoMotors
             ,showroomsedanLogo,showroomSUVLogo,showroomvanLogo,showroomunderboneLogo,showroomscooterLogo,
             motorsLabel,carsLogo,motorsLogo,carsTitle,motorsTitle,sedanLabel,
             SUVLabel,vanLabel,underboneLabel,scooterLabel
             ,civicName,civicpriceText,civictransmissionPick,viosName,viospriceText,viostransmissionPick
             ,civicaddFee,viosaddFee
             ,monteroName,monteropriceText,monterotransmissionPick,crvName,crvpriceText,crvtransmissionPick
             ,monteroaddFee,crvaddFee
             ,hiaceName,hiacepriceText,hiacetransmissionPick,chevyName,chevypriceText,chevytransmissionPick
             ,hiaceaddFee,chevyaddFee
             ,sniperName,sniperpriceText,supraName,suprapriceText
             ,mioName,miopriceText,dioName,diopriceText
             ,orderformLogo,totalText,vatText,discountText,gtamountText,amounttenderedText,changeText;
     
     String transmissionpickCivic,transmissionpickVios,transmissionpickMontero,transmissionpickCrv,transmissionpickHiace,transmissionpickChevy;
     
     JButton logo,loginButton,motors,cars,backbuttonCars,backbuttonMotors,sedanLogo,SUVLogo,vanLogo,underboneLogo,scooterLogo
             ,backbuttonSedan,backbuttonSUV,backbuttonVan,backbuttonUnderbone,backbuttonScooter
             ,civicsedanButton,viossedanButton,civicbuyButton,civicconfirmButton,viosconfirmButton,viosbuyButton
             ,crvsuvButton,crvbuyButton,crvconfirmButton,monterosuvButton,monterobuyButton,monteroconfirmButton
             ,hiacevanButton,hiacebuyButton,hiaceconfirmButton,chevyvanButton,chevybuyButton,chevyconfirmButton
             ,sniperunderboneButton,sniperbuyButton,sniperconfirmButton,supraunderboneButton,suprabuyButton,supraconfirmButton
             ,mioscooterButton,miobuyButton,mioconfirmButton,dioscooterButton,diobuyButton,dioconfirmButton
             ,homeButton,confirmorderButton;
     
     JTextArea civicDescription,viosDescription
             ,crvDescription,monteroDescription
             ,hiaceDescription,chevyDescription
             ,sniperDescription,supraDescription
             ,mioDescription,dioDescription;
     
     JRadioButton civicAutomatic,civicManual,viosAutomatic,viosManual,
             monteroManual,monteroAutomatic,crvManual,crvAutomatic,
             hiaceAutomatic,hiaceManual,chevyManual,chevyAutomatic;
     
     
     ButtonGroup bg;
     
     JTable orderForm;
     
     JScrollPane j;
             
     ImageIcon imagelogo;
     
     JTextField user
             ,totalTextfield,vatTextfield,discountTextfield,gtaTextfield,amounttenderedTextfield,changeTextfield;
     
     JPasswordField pass;
     
     String username,password;
     
     String[] columnNames= {"Name","Quantity","Price","Transmission","Additional Fees"};
    String[][] data= {{"","","","",""}};
    
    String thankyoudialog="Thank you for purchasing!";
            
    JLabel nameTable,quantityTable,transmissionTable,addfeesTable,priceTable;
    
    theShowroom(){
    //the account
    username= "customer1";
    password= "password";
    
    
   //WELCOME Frame Variables
    introFrame= new JFrame("Welcome");
    backgroundgif=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\background720p.gif"));
    logo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent4.png"));
    userlabel=new JLabel("USERNAME: ");
    passlabel=new JLabel("PASSWORD: ");
    user=new JTextField("");
    pass=new JPasswordField("");
    loginButton=new JButton("Login");
    
    //menuFrame Variables
    menuFrame=new JFrame("Menu");
    backgroundMenu= new JPanel();
    nameAccMenu=new JLabel(username);
    carsLabel=new JLabel("CARS");
    motorsLabel=new JLabel("MOTORCYCLES");
    carsLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\traffic-jam240p.png"));
    motorsLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\motorcycle240p.png"));
    logoMenu=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    motors=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\motorcycle240p.png"));
    cars=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\traffic-jam240p.png"));
    
    //carsFrame Variables
    carsFrame=new JFrame("Cars");
    backgroundCars=new JPanel();
    nameAccCars=new JLabel(username);
    carsTitle=new JLabel("CARS");
    sedanLabel=new JLabel("Sedan");
    SUVLabel=new JLabel("SUV");
    vanLabel=new JLabel("Van");
    showroomLogoCars=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    sedanLogo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\sedan.png"));
    SUVLogo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\suv.png"));
    vanLogo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\van.png"));
    backbuttonCars=new JButton("BACK");
    
    //sedanFrame
    sedanFrame=new JFrame("Sedan(CARS)");
    backgroundSedan=new JPanel();
    nameAccSedan=new JLabel(username);
    backbuttonSedan=new JButton("BACK");
    showroomsedanLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    
    civicsedanButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\civicresize.png"));
    civicName= new JLabel("Phoenix Chevel");
    civicDescription=new JTextArea("A compact sedan that'll fit your taste."
            +"\n With comfortable seats and cool exterior \n design and a"
            + " V8 Engine + Turbo. AWD \n"
            + "Default Transmission: Automatic"); 
    civicpriceText=new JLabel("P1,250,000");
    civictransmissionPick=new JLabel("Transmission: ");
    civicbuyButton=new JButton("BUY");
    civicconfirmButton=new JButton("CONFIRM");
    civicAutomatic=new JRadioButton("Default");
    civicManual=new JRadioButton("Manual");
    civicaddFee=new JLabel("+ P100,000");
    bg=new ButtonGroup();
    
    
   
    viossedanButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\viosresize.png"));
    viosName=new JLabel("Olets Loco");
    viosDescription=new JTextArea("A budget sedan that fits for all your necessities \n"
            + "2.8mAL, CTEC Engine that goes up to 250hp. RWD \n "
            + "Defaul Transmission: Manual");
    viospriceText=new JLabel("P985,999");
    viostransmissionPick=new JLabel("Transmission: ");
    viosbuyButton=new JButton("BUY");
    viosconfirmButton=new JButton("CONFIRM");
    viosAutomatic=new JRadioButton("Automatic");
    viosManual=new JRadioButton("Default");
    viosaddFee=new JLabel("+ P300,000");
    
    //SUVFrame
    SUVFrame=new JFrame("SUV(CARS)");
    backgroundSUV=new JPanel();
    nameAccSUV=new JLabel(username);
    backbuttonSUV=new JButton("BACK");
    showroomSUVLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    
    crvsuvButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\crvresize.png"));
    crvName=new JLabel("Leech Behembra");
    
    crvDescription=new JTextArea("A compact little SUV that fits for your taste \n"
            + "Deafult Transmission: Manual. AWD");
    
    crvpriceText=new JLabel("P1,350,000");
    crvtransmissionPick=new JLabel("Transmission: ");
    crvManual=new JRadioButton("Default");
    crvAutomatic=new JRadioButton("Automatic");
    crvaddFee=new JLabel("+P300,000");
    crvbuyButton=new JButton("BUY");
    crvconfirmButton=new JButton("CONFIRM");
    
    
    
    monterosuvButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\monteroresize.png"));
    monteroName= new JLabel("Toru Runeterra");
    
    monteroDescription= new JTextArea("A sporty SUV that'll let you enjoy the ride \n"
            + "Default Transmission: Automatic. AWD ");
    
    monteropriceText=new JLabel("P1,500,000");
    monterotransmissionPick=new JLabel("Transmission: ");
    monteroaddFee=new JLabel("+P150,000");
    monteroManual=new JRadioButton("Manual");
    monteroAutomatic=new JRadioButton("Default");
    monterobuyButton=new JButton("BUY");
    monteroconfirmButton=new JButton("CONFIRM");
            
    //vanFrame
     vanFrame=new JFrame("Van(CARS)");
    backgroundVan=new JPanel();
    nameAccVan=new JLabel(username);
    backbuttonVan=new JButton("BACK");
    showroomvanLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    
    hiacevanButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\hiaceresize.png"));
    hiaceName=new JLabel("Nocan Graviole");
    
    hiaceDescription=new JTextArea("A 18 seater Van that fit for your family and business \n"
            + "Deafult Transmission: Automatic. AWD");
    
    hiacepriceText=new JLabel("P1,800,000");
    hiacetransmissionPick=new JLabel("Transmission: ");
    hiaceManual=new JRadioButton("Default");
    hiaceAutomatic=new JRadioButton("Manual");
    hiaceaddFee=new JLabel("+P150,000");
    hiacebuyButton=new JButton("BUY");
    hiaceconfirmButton=new JButton("CONFIRM");
    
    
    
    chevyvanButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\chevyvanresize.png"));
    chevyName= new JLabel("Vyegrol Munch");
    
    chevyDescription= new JTextArea("A Van that'll suit for any kind of business \n"
            + "Default Transmission: Automatic. RWD ");
    
    chevypriceText=new JLabel("P1,500,000");
    chevytransmissionPick=new JLabel("Transmission: ");
    chevyaddFee=new JLabel("+P150,000");
    chevyManual=new JRadioButton("Manual");
    chevyAutomatic=new JRadioButton("Default");
    chevybuyButton=new JButton("BUY");
    chevyconfirmButton=new JButton("CONFIRM");
            
    
    //motorsFrame Variables
    motorsFrame=new JFrame("Motorcycles");
    motorsTitle=new JLabel("MOTORCYCLES");
    nameAccMotors=new JLabel(username);
    backgroundMotors=new JPanel();
    underboneLabel=new JLabel("Underbone");
    scooterLabel=new JLabel("Scooter");
    showroomLogoMotors=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    backbuttonMotors=new JButton("BACK");
    underboneLogo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\underbone.png"));
    scooterLogo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\motorcycle240p.png"));
    
    //underboneFrame Variables
    underboneFrame=new JFrame("Underbone(MOTORCYCLES)");
    backgroundUnderbone=new JPanel();
    nameAccUnderbone=new JLabel(username);
    backbuttonUnderbone=new JButton("BACK");
    showroomunderboneLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    
    sniperunderboneButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\sniper135resize.png"));
    sniperName=new JLabel("Pistol 135");
    
    sniperDescription=new JTextArea("5 Strokes without clutch \n"
            + "135 CC");
            
    
    sniperpriceText=new JLabel("P85,000");
    sniperbuyButton=new JButton("BUY");
    sniperconfirmButton=new JButton("CONFIRM");
    
    
    
    supraunderboneButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\supragtr150resize.png"));
    supraName= new JLabel("EvoSkyline 150");
    
    supraDescription= new JTextArea("6 Strokes with clutch \n"
            + "150 CC");
    
    suprapriceText=new JLabel("P105,000");
    suprabuyButton=new JButton("BUY");
    supraconfirmButton=new JButton("CONFIRM");
    
    //scooterFrame Variables
    scooterFrame=new JFrame("Scooter(MOTORCYCLES)");
    backgroundScooter=new JPanel();
    nameAccScooter=new JLabel(username);
    backbuttonScooter=new JButton("BACK");
    showroomscooterLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
   
    
    mioscooterButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\mioresize.png"));
    mioName=new JLabel("Maya Yui");
    
    mioDescription=new JTextArea("A small scooter that capable of giving fast travel \n"
            + "125CC");
            
    
    miopriceText=new JLabel("P85,000");
    miobuyButton=new JButton("BUY");
    mioconfirmButton=new JButton("CONFIRM");
    
    
    
    dioscooterButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\dio resize.png"));
    dioName= new JLabel("Gionna Natsu");
    
    dioDescription= new JTextArea("A scooter that has a large body \n"
            + "115 CC");
           
    
    diopriceText=new JLabel("P65,000");
    diobuyButton=new JButton("BUY");
    dioconfirmButton=new JButton("CONFIRM");
    
    //orderForm Frame Variables
    orderformFrame= new JFrame("Order Summary");
    orderformBackground= new JPanel();
    orderformLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    orderForm=new JTable(data, columnNames);
    nameTable=new JLabel("NAME");
    quantityTable=new JLabel("QUANTITY");
    transmissionTable=new JLabel("TRANSMISSION");
    addfeesTable=new JLabel("ADDITIONAL FEES");
    priceTable=new JLabel("PRICE");
    homeButton=new JButton("Home");
    totalText=new JLabel("Total: ");
    vatText=new JLabel("VAT: ");
    discountText=new JLabel("Discount: ");
    gtamountText=new JLabel("Total Amount: ");
    amounttenderedText=new JLabel("Payment Amount: ");
    changeText=new JLabel("Change: ");
    confirmorderButton=new JButton("CONFIRM");
    totalTextfield=new JTextField();    
    vatTextfield=new JTextField();
    discountTextfield=new JTextField();
    gtaTextfield=new JTextField();
    amounttenderedTextfield=new JTextField();
    changeTextfield=new JTextField();
    
    
    
    
    //WELCOME FRAME
    userlabel.setBounds(500,400,150,150);
    userlabel.setForeground(Color.white);
    userlabel.setVisible(false);
    introFrame.add(userlabel);
   
    passlabel.setBounds(495,450,150,150);
    passlabel.setForeground(Color.white);
    passlabel.setVisible(false);
    introFrame.add(passlabel);
    
    
    user.setBounds(580,460,250,30);
    user.setBackground(Color.BLACK);
    user.setForeground(Color.WHITE);
    user.setVisible(false);
    introFrame.add(user);
    
    pass.setBounds(580,510,250,30);
    pass.setBackground(Color.BLACK);;
    pass.setForeground(Color.WHITE);
    pass.setVisible(false);
    introFrame.add(pass);
    
    loginButton.setBounds(650,560,100,30);
    loginButton.setOpaque(false);
    loginButton.setContentAreaFilled(false);
    loginButton.setForeground(Color.white);
    loginButton.setVisible(false);
    introFrame.add(loginButton);
    
    logo.setBounds(200,0,852,480);
    logo.setOpaque(false);
    logo.setContentAreaFilled(false);
    logo.setBorderPainted(false);
    introFrame.add(logo);
    
    backgroundgif.setBounds(0,0,1280,720);
    introFrame.add(backgroundgif);
    
    
   
    //menu FRAME
    
    cars.setBounds(280,220,256,256);
    cars.setOpaque(false);
    cars.setContentAreaFilled(false);
    cars.setBorderPainted(false);
    backgroundMenu.add(cars);
    
    motors.setBounds(720,220,256,256);
    motors.setOpaque(false);
    motors.setContentAreaFilled(false);
    motors.setBorderPainted(false);
    backgroundMenu.add(motors);
    
    /*carsLogo.setBounds(170,130,500,500);
    backgroundMenu.add(carsLogo);
    
    motorsLogo.setBounds(600,130,500,500);
    backgroundMenu.add(motorsLogo);
    */
    
            
    carsLabel.setBounds(350,500,100,100);
    carsLabel.setFont(new Font("Arial",Font.BOLD,25));
    carsLabel.setForeground(Color.BLACK);
    backgroundMenu.add(carsLabel);
    
    
    motorsLabel.setBounds(750,500,750,100);
    motorsLabel.setFont(new Font("Arial",Font.BOLD,25));
    motorsLabel.setForeground(Color.BLACK);
    backgroundMenu.add(motorsLabel);
    
    
    nameAccMenu.setBounds(250,25,500,100);
    nameAccMenu.setFont(new Font("Arial",Font.BOLD,25));
    nameAccMenu.setForeground(Color.WHITE);
    backgroundMenu.add(nameAccMenu);
    
    logoMenu.setBounds(1,1,256,144);
    backgroundMenu.add(logoMenu);
    
    backgroundMenu.setBounds(1,1,1280,720);
    backgroundMenu.setBackground(Color.GRAY);
    backgroundMenu.setLayout(null);
    menuFrame.add(backgroundMenu);
  
    
    //carsFrame
    sedanLogo.setBounds(100,300,256,256);
    sedanLogo.setOpaque(false);
    sedanLogo.setContentAreaFilled(false);
    sedanLogo.setBorderPainted(false);
    backgroundCars.add(sedanLogo);
    
    SUVLogo.setBounds(500,300,256,256);
    SUVLogo.setOpaque(false);
    SUVLogo.setContentAreaFilled(false);
    SUVLogo.setBorderPainted(false);
    backgroundCars.add(SUVLogo);
    
    vanLogo.setBounds(900,300,256,256);
    vanLogo.setOpaque(false);
    vanLogo.setContentAreaFilled(false);
    vanLogo.setBorderPainted(false);
    backgroundCars.add(vanLogo);
   
    carsTitle.setBounds(550,100,300,100);
    carsTitle.setFont(new Font("Arial",Font.BOLD,50));
    carsTitle.setForeground(Color.BLACK);
    backgroundCars.add(carsTitle);
    
    nameAccCars.setBounds(250,25,500,100);
    nameAccCars.setFont(new Font("Arial",Font.BOLD,25));
    nameAccCars.setForeground(Color.WHITE);
    backgroundCars.add(nameAccCars);
    
    sedanLabel.setBounds(200,500,100,100);
    sedanLabel.setFont(new Font("Arial",Font.BOLD,25));
    sedanLabel.setForeground(Color.BLACK);
    backgroundCars.add(sedanLabel);
    
    SUVLabel.setBounds(600,500,100,100);
    SUVLabel.setFont(new Font("Arial",Font.BOLD,25));
    SUVLabel.setForeground(Color.BLACK);
    backgroundCars.add(SUVLabel);
    
    vanLabel.setBounds(1000,500,100,100);
    vanLabel.setFont(new Font("Arial",Font.BOLD,25));
    vanLabel.setForeground(Color.BLACK);
    backgroundCars.add(vanLabel);
    
    showroomLogoCars.setBounds(1,1,256,144);
    backgroundCars.add(showroomLogoCars);
    
    backbuttonCars.setBounds(1100,630,100,30);
    backbuttonCars.setOpaque(false);
    backbuttonCars.setContentAreaFilled(false);
    backbuttonCars.setBorderPainted(false);
    backbuttonCars.setForeground(Color.BLACK);
    backgroundCars.add(backbuttonCars);
    
    backgroundCars.setBounds(1,1,1280,720);
    backgroundCars.setBackground(Color.GRAY);
    backgroundCars.setLayout(null);
    carsFrame.add(backgroundCars);
    
    //sedanFrame
    viossedanButton.setBounds(750,200,256,85);
    viossedanButton.setOpaque(false);
    viossedanButton.setContentAreaFilled(false);
    viossedanButton.setBorderPainted(false);
    backgroundSedan.add(viossedanButton);
    
    viospriceText.setBounds(880,350,200,100);
    viospriceText.setFont(new Font("Arial",Font.BOLD,25));
    viospriceText.setForeground(Color.BLACK);
    viospriceText.setVisible(false);
    backgroundSedan.add(viospriceText); 
    
    viosName.setBounds(830,250,200,100);
    viosName.setFont(new Font("Arial",Font.BOLD,18));
    viosName.setForeground(Color.BLACK);
    viosName.setVisible(false);
    backgroundSedan.add(viosName);
    
    viosDescription.setBounds(770,320,500,100);
    viosDescription.setFont(new Font("Arial",Font.BOLD,12));
    viosDescription.setForeground(Color.BLACK);
    viosDescription.setLineWrap(true);
    viosDescription.setWrapStyleWord(true);
    viosDescription.setBackground(Color.GRAY);
    viosDescription.setVisible(false);
    viosDescription.setEditable(false);
    backgroundSedan.add(viosDescription);
    
    viosbuyButton.setBounds(1000,470,100,30);
    viosbuyButton.setOpaque(false);
    viosbuyButton.setContentAreaFilled(false);
    viosbuyButton.setBorderPainted(false);
    viosbuyButton.setVisible(false);
    viosbuyButton.setForeground(Color.BLACK);
    backgroundSedan.add(viosbuyButton);
    
    viosconfirmButton.setBounds(1000,470,100,30);
    viosconfirmButton.setOpaque(false);
    viosconfirmButton.setContentAreaFilled(false);
    viosconfirmButton.setBorderPainted(false);
    viosconfirmButton.setVisible(false);
    viosconfirmButton.setForeground(Color.BLACK);
    backgroundSedan.add(viosconfirmButton);
    
    viostransmissionPick.setBounds(750,400,200,100);
    viostransmissionPick.setFont(new Font("Arial",Font.BOLD,15));
    viostransmissionPick.setForeground(Color.BLACK);
    viostransmissionPick.setVisible(false);
    backgroundSedan.add(viostransmissionPick);
    
    viosAutomatic.setBounds(870,435,100,30);
    viosAutomatic.setOpaque(false);
    viosAutomatic.setContentAreaFilled(false);
    viosAutomatic.setBorderPainted(false);
    viosAutomatic.setVisible(false);
    bg.add(viosAutomatic);
    backgroundSedan.add(viosAutomatic);
    
    viosManual.setBounds(960,435,100,30);
    viosManual.setOpaque(false);
    viosManual.setContentAreaFilled(false);
    viosManual.setBorderPainted(false);
    viosManual.setVisible(false);
    bg.add(viosManual);
    backgroundSedan.add(viosManual);
    
    viosaddFee.setBounds(1000,415,200,100);
    viosaddFee.setFont(new Font("Arial",Font.BOLD,10));
    viosaddFee.setForeground(Color.BLACK);
    viosaddFee.setVisible(false);
    backgroundSedan.add(viosaddFee);
    
    civicsedanButton.setBounds(250,200,256,85);
    civicsedanButton.setOpaque(false);
    civicsedanButton.setContentAreaFilled(false);
    civicsedanButton.setBorderPainted(false);
    backgroundSedan.add(civicsedanButton);
    
    civicpriceText.setBounds(330,350,200,100);
    civicpriceText.setFont(new Font("Arial",Font.BOLD,25));
    civicpriceText.setForeground(Color.BLACK);
    civicpriceText.setVisible(false);
    backgroundSedan.add(civicpriceText); 
    
    civicName.setBounds(310,250,200,100);
    civicName.setFont(new Font("Arial",Font.BOLD,18));
    civicName.setForeground(Color.BLACK);
    civicName.setVisible(false);
    backgroundSedan.add(civicName);
    
    civicDescription.setBounds(280,320,500,100);
    civicDescription.setFont(new Font("Arial",Font.BOLD,12));
    civicDescription.setForeground(Color.BLACK);
    civicDescription.setLineWrap(true);
    civicDescription.setWrapStyleWord(true);
    civicDescription.setBackground(Color.GRAY);
    civicDescription.setVisible(false);
    civicDescription.setEditable(false);
    backgroundSedan.add(civicDescription);
    
    civicbuyButton.setBounds(430,470,100,30);
    civicbuyButton.setOpaque(false);
    civicbuyButton.setContentAreaFilled(false);
    civicbuyButton.setBorderPainted(false);
    civicbuyButton.setVisible(false);
    civicbuyButton.setForeground(Color.BLACK);
    backgroundSedan.add(civicbuyButton);
    
    civicconfirmButton.setBounds(430,470,100,30);
    civicconfirmButton.setOpaque(false);
    civicconfirmButton.setContentAreaFilled(false);
    civicconfirmButton.setBorderPainted(false);
    civicconfirmButton.setVisible(false);
    civicconfirmButton.setForeground(Color.BLACK);
    backgroundSedan.add(civicconfirmButton);
    
    civictransmissionPick.setBounds(220,400,200,100);
    civictransmissionPick.setFont(new Font("Arial",Font.BOLD,15));
    civictransmissionPick.setForeground(Color.BLACK);
    civictransmissionPick.setVisible(false);
    backgroundSedan.add(civictransmissionPick);
    
    civicAutomatic.setBounds(350,435,100,30);
    civicAutomatic.setOpaque(false);
    civicAutomatic.setContentAreaFilled(false);
    civicAutomatic.setBorderPainted(false);
    civicAutomatic.setVisible(false);
    bg.add(civicAutomatic);
    backgroundSedan.add(civicAutomatic);
    
    civicManual.setBounds(430,435,100,30);
    civicManual.setOpaque(false);
    civicManual.setContentAreaFilled(false);
    civicManual.setBorderPainted(false);
    civicManual.setVisible(false);
    bg.add(civicManual);
    backgroundSedan.add(civicManual);
    
    civicaddFee.setBounds(480,415,200,100);
    civicaddFee.setFont(new Font("Arial",Font.BOLD,10));
    civicaddFee.setForeground(Color.BLACK);
    civicaddFee.setVisible(false);
    backgroundSedan.add(civicaddFee);
    
    backbuttonSedan.setBounds(1100,630,100,30);
    backbuttonSedan.setOpaque(false);
    backbuttonSedan.setContentAreaFilled(false);
    backbuttonSedan.setBorderPainted(false);
    backbuttonSedan.setForeground(Color.BLACK);
    backgroundSedan.add(backbuttonSedan);
    
    nameAccSedan.setBounds(250,25,500,100);
    nameAccSedan.setFont(new Font("Arial",Font.BOLD,25));
    nameAccSedan.setForeground(Color.WHITE);
    backgroundSedan.add(nameAccSedan);
    
    showroomsedanLogo.setBounds(1,1,256,144);
    backgroundSedan.add(showroomsedanLogo);
    
    backgroundSedan.setBounds(1,1,1280,720);
    backgroundSedan.setBackground(Color.GRAY);
    backgroundSedan.setLayout(null);
    sedanFrame.add(backgroundSedan);
    
    //SUVFrame
    monterosuvButton.setBounds(250,160,256,239);
    monterosuvButton.setOpaque(false);
    monterosuvButton.setContentAreaFilled(false);
    monterosuvButton.setBorderPainted(false);
    backgroundSUV.add(monterosuvButton);
    
    monteroName.setBounds(310,320,200,100);
    monteroName.setFont(new Font("Arial",Font.BOLD,18));
    monteroName.setForeground(Color.BLACK);
    monteroName.setVisible(false);
    backgroundSUV.add(monteroName);
    
    monteropriceText.setBounds(350,400,200,100);
    monteropriceText.setFont(new Font("Arial",Font.BOLD,25));
    monteropriceText.setForeground(Color.BLACK);
    monteropriceText.setVisible(false);
    backgroundSUV.add(monteropriceText); 
    
    monteroDescription.setBounds(280,390,300,50);
    monteroDescription.setFont(new Font("Arial",Font.BOLD,12));
    monteroDescription.setForeground(Color.BLACK);
    monteroDescription.setLineWrap(true);
    monteroDescription.setWrapStyleWord(true);
    monteroDescription.setBackground(Color.GRAY);
    monteroDescription.setVisible(false);
    monteroDescription.setEditable(false);
    backgroundSUV.add(monteroDescription);
    
    monterotransmissionPick.setBounds(220,440,200,100);
    monterotransmissionPick.setFont(new Font("Arial",Font.BOLD,15));
    monterotransmissionPick.setForeground(Color.BLACK);
    monterotransmissionPick.setVisible(false);
    backgroundSUV.add(monterotransmissionPick);
    
    monteroAutomatic.setBounds(350,475,100,30);
    monteroAutomatic.setOpaque(false);
    monteroAutomatic.setContentAreaFilled(false);
    monteroAutomatic.setBorderPainted(false);
    monteroAutomatic.setVisible(false);
    bg.add(monteroAutomatic);
    backgroundSUV.add(monteroAutomatic);
    
    monteroManual.setBounds(430,475,100,30);
    monteroManual.setOpaque(false);
    monteroManual.setContentAreaFilled(false);
    monteroManual.setBorderPainted(false);
    monteroManual.setVisible(false);
    bg.add(monteroManual);
    backgroundSUV.add(monteroManual);
    
    monteroaddFee.setBounds(480,460,200,100);
    monteroaddFee.setFont(new Font("Arial",Font.BOLD,10));
    monteroaddFee.setForeground(Color.BLACK);
    monteroaddFee.setVisible(false);
    backgroundSUV.add(monteroaddFee);
    
    monterobuyButton.setBounds(430,520,100,30);
    monterobuyButton.setOpaque(false);
    monterobuyButton.setContentAreaFilled(false);
    monterobuyButton.setBorderPainted(false);
    monterobuyButton.setVisible(false);
    monterobuyButton.setForeground(Color.BLACK);
    backgroundSUV.add(monterobuyButton);
    
    monteroconfirmButton.setBounds(430,520,100,30);
    monteroconfirmButton.setOpaque(false);
    monteroconfirmButton.setContentAreaFilled(false);
    monteroconfirmButton.setBorderPainted(false);
    monteroconfirmButton.setVisible(false);
    monteroconfirmButton.setForeground(Color.BLACK);
    backgroundSUV.add(monteroconfirmButton);
    
    crvsuvButton.setBounds(750,200,256,192);
    crvsuvButton.setOpaque(false);
    crvsuvButton.setContentAreaFilled(false);
    crvsuvButton.setBorderPainted(false);
    backgroundSUV.add(crvsuvButton);
    
    crvName.setBounds(830,310,200,100);
    crvName.setFont(new Font("Arial",Font.BOLD,18));
    crvName.setForeground(Color.BLACK);
    crvName.setVisible(false);
    backgroundSUV.add(crvName);
    
    crvDescription.setBounds(770,380,300,30);
    crvDescription.setFont(new Font("Arial",Font.BOLD,12));
    crvDescription.setForeground(Color.BLACK);
    crvDescription.setLineWrap(true);
    crvDescription.setWrapStyleWord(true);
    crvDescription.setBackground(Color.GRAY);
    crvDescription.setVisible(false);
    crvDescription.setEditable(false);
    backgroundSUV.add(crvDescription);
    
    crvpriceText.setBounds(880,380,200,100);
    crvpriceText.setFont(new Font("Arial",Font.BOLD,25));
    crvpriceText.setForeground(Color.BLACK);
    crvpriceText.setVisible(false);
    backgroundSUV.add(crvpriceText); 
    
    crvtransmissionPick.setBounds(750,430,200,100);
    crvtransmissionPick.setFont(new Font("Arial",Font.BOLD,15));
    crvtransmissionPick.setForeground(Color.BLACK);
    crvtransmissionPick.setVisible(false);
    backgroundSUV.add(crvtransmissionPick);
    
    crvAutomatic.setBounds(870,465,100,30);
    crvAutomatic.setOpaque(false);
    crvAutomatic.setContentAreaFilled(false);
    crvAutomatic.setBorderPainted(false);
    crvAutomatic.setVisible(false);
    bg.add(crvAutomatic);
    backgroundSUV.add(crvAutomatic);
    
    crvManual.setBounds(960,465,100,30);
    crvManual.setOpaque(false);
    crvManual.setContentAreaFilled(false);
    crvManual.setBorderPainted(false);
    crvManual.setVisible(false);
    bg.add(crvManual);
    backgroundSUV.add(crvManual);
    
    crvaddFee.setBounds(1000,450,200,100);
    crvaddFee.setFont(new Font("Arial",Font.BOLD,10));
    crvaddFee.setForeground(Color.BLACK);
    crvaddFee.setVisible(false);
    backgroundSUV.add(crvaddFee);
    
    crvbuyButton.setBounds(1000,510,100,30);
    crvbuyButton.setOpaque(false);
    crvbuyButton.setContentAreaFilled(false);
    crvbuyButton.setBorderPainted(false);
    crvbuyButton.setVisible(false);
    crvbuyButton.setForeground(Color.BLACK);
    backgroundSUV.add(crvbuyButton);
    
    crvconfirmButton.setBounds(1000,510,100,30);
    crvconfirmButton.setOpaque(false);
    crvconfirmButton.setContentAreaFilled(false);
    crvconfirmButton.setBorderPainted(false);
    crvconfirmButton.setVisible(false);
    crvconfirmButton.setForeground(Color.BLACK);
    backgroundSUV.add(crvconfirmButton);
    
    backbuttonSUV.setBounds(1100,630,100,30);
    backbuttonSUV.setOpaque(false);
    backbuttonSUV.setContentAreaFilled(false);
    backbuttonSUV.setBorderPainted(false);
    backbuttonSUV.setForeground(Color.BLACK);
    backgroundSUV.add(backbuttonSUV);
    
    nameAccSUV.setBounds(250,25,500,100);
    nameAccSUV.setFont(new Font("Arial",Font.BOLD,25));
    nameAccSUV.setForeground(Color.WHITE);
    backgroundSUV.add(nameAccSUV);
    
    showroomSUVLogo.setBounds(1,1,256,144);
    backgroundSUV.add(showroomSUVLogo);
    
    backgroundSUV.setBounds(1,1,1280,720);
    backgroundSUV.setBackground(Color.GRAY);
    backgroundSUV.setLayout(null);
    SUVFrame.add(backgroundSUV);
    
    //vanFrame
    hiacevanButton.setBounds(250,160,256,85);
    hiacevanButton.setOpaque(false);
    hiacevanButton.setContentAreaFilled(false);
    hiacevanButton.setBorderPainted(false);
    backgroundVan.add(hiacevanButton);
    
    hiaceName.setBounds(310,220,200,100);
    hiaceName.setFont(new Font("Arial",Font.BOLD,18));
    hiaceName.setForeground(Color.BLACK);
    hiaceName.setVisible(false);
    backgroundVan.add(hiaceName);
    
    hiaceDescription.setBounds(260,290,300,50);
    hiaceDescription.setFont(new Font("Arial",Font.BOLD,12));
    hiaceDescription.setForeground(Color.BLACK);
    hiaceDescription.setLineWrap(true);
    hiaceDescription.setWrapStyleWord(true);
    hiaceDescription.setBackground(Color.GRAY);
    hiaceDescription.setVisible(false);
    hiaceDescription.setEditable(false);
    backgroundVan.add(hiaceDescription);
    
    hiacepriceText.setBounds(350,300,200,100);
    hiacepriceText.setFont(new Font("Arial",Font.BOLD,25));
    hiacepriceText.setForeground(Color.BLACK);
    hiacepriceText.setVisible(false);
    backgroundVan.add(hiacepriceText); 
    
    hiacetransmissionPick.setBounds(220,330,200,100);
    hiacetransmissionPick.setFont(new Font("Arial",Font.BOLD,15));
    hiacetransmissionPick.setForeground(Color.BLACK);
    hiacetransmissionPick.setVisible(false);
    backgroundVan.add(hiacetransmissionPick);
    
    hiaceAutomatic.setBounds(350,365,100,30);
    hiaceAutomatic.setOpaque(false);
    hiaceAutomatic.setContentAreaFilled(false);
    hiaceAutomatic.setBorderPainted(false);
    hiaceAutomatic.setVisible(false);
    bg.add(hiaceAutomatic);
    backgroundVan.add(hiaceAutomatic);
    
    hiaceManual.setBounds(430,365,100,30);
    hiaceManual.setOpaque(false);
    hiaceManual.setContentAreaFilled(false);
    hiaceManual.setBorderPainted(false);
    hiaceManual.setVisible(false);
    bg.add(hiaceManual);
    backgroundVan.add(hiaceManual);
    
    hiaceaddFee.setBounds(460,350,200,100);
    hiaceaddFee.setFont(new Font("Arial",Font.BOLD,10));
    hiaceaddFee.setForeground(Color.BLACK);
    hiaceaddFee.setVisible(false);
    backgroundVan.add(hiaceaddFee);
    
    hiacebuyButton.setBounds(430,430,100,30);
    hiacebuyButton.setOpaque(false);
    hiacebuyButton.setContentAreaFilled(false);
    hiacebuyButton.setBorderPainted(false);
    hiacebuyButton.setVisible(false);
    hiacebuyButton.setForeground(Color.BLACK);
    backgroundVan.add(hiacebuyButton);
    
    hiaceconfirmButton.setBounds(430,430,100,30);
    hiaceconfirmButton.setOpaque(false);
    hiaceconfirmButton.setContentAreaFilled(false);
    hiaceconfirmButton.setBorderPainted(false);
    hiaceconfirmButton.setVisible(false);
    hiaceconfirmButton.setForeground(Color.BLACK);
    backgroundVan.add(hiaceconfirmButton);
    
    chevyvanButton.setBounds(750,160,256,85);
    chevyvanButton.setOpaque(false);
    chevyvanButton.setContentAreaFilled(false);
    chevyvanButton.setBorderPainted(false);
    backgroundVan.add(chevyvanButton);
    
    chevyName.setBounds(830,220,200,100);
    chevyName.setFont(new Font("Arial",Font.BOLD,18));
    chevyName.setForeground(Color.BLACK);
    chevyName.setVisible(false);
    backgroundVan.add(chevyName);
    
    chevyDescription.setBounds(770,290,300,30);
    chevyDescription.setFont(new Font("Arial",Font.BOLD,12));
    chevyDescription.setForeground(Color.BLACK);
    chevyDescription.setLineWrap(true);
    chevyDescription.setWrapStyleWord(true);
    chevyDescription.setBackground(Color.GRAY);
    chevyDescription.setVisible(false);
    chevyDescription.setEditable(false);
    backgroundVan.add(chevyDescription);
    
    chevypriceText.setBounds(880,300,200,100);
    chevypriceText.setFont(new Font("Arial",Font.BOLD,25));
    chevypriceText.setForeground(Color.BLACK);
    chevypriceText.setVisible(false);
    backgroundVan.add(chevypriceText); 
    
    chevytransmissionPick.setBounds(750,330,200,100);
    chevytransmissionPick.setFont(new Font("Arial",Font.BOLD,15));
    chevytransmissionPick.setForeground(Color.BLACK);
    chevytransmissionPick.setVisible(false);
    backgroundVan.add(chevytransmissionPick);
    
    chevyAutomatic.setBounds(870,365,100,30);
    chevyAutomatic.setOpaque(false);
    chevyAutomatic.setContentAreaFilled(false);
    chevyAutomatic.setBorderPainted(false);
    chevyAutomatic.setVisible(false);
    bg.add(chevyAutomatic);
    backgroundVan.add(chevyAutomatic);
    
    chevyManual.setBounds(960,365,100,30);
    chevyManual.setOpaque(false);
    chevyManual.setContentAreaFilled(false);
    chevyManual.setBorderPainted(false);
    chevyManual.setVisible(false);
    bg.add(chevyManual);
    backgroundVan.add(chevyManual);
    
    chevyaddFee.setBounds(1000,350,200,100);
    chevyaddFee.setFont(new Font("Arial",Font.BOLD,10));
    chevyaddFee.setForeground(Color.BLACK);
    chevyaddFee.setVisible(false);
    backgroundVan.add(chevyaddFee);
    
    chevybuyButton.setBounds(1000,420,100,30);
    chevybuyButton.setOpaque(false);
    chevybuyButton.setContentAreaFilled(false);
    chevybuyButton.setBorderPainted(false);
    chevybuyButton.setVisible(false);
    chevybuyButton.setForeground(Color.BLACK);
    backgroundVan.add(chevybuyButton);
    
    chevyconfirmButton.setBounds(1000,420,100,30);
    chevyconfirmButton.setOpaque(false);
    chevyconfirmButton.setContentAreaFilled(false);
    chevyconfirmButton.setBorderPainted(false);
    chevyconfirmButton.setVisible(false);
    chevyconfirmButton.setForeground(Color.BLACK);
    backgroundVan.add(chevyconfirmButton);
    
    backbuttonVan.setBounds(1100,630,100,30);
    backbuttonVan.setOpaque(false);
    backbuttonVan.setContentAreaFilled(false);
    backbuttonVan.setBorderPainted(false);
    backbuttonVan.setForeground(Color.BLACK);
    backgroundVan.add(backbuttonVan);
    
    nameAccVan.setBounds(250,25,500,100);
    nameAccVan.setFont(new Font("Arial",Font.BOLD,25));
    nameAccVan.setForeground(Color.WHITE);
    backgroundVan.add(nameAccVan);
    
    showroomvanLogo.setBounds(1,1,256,144);
    backgroundVan.add(showroomvanLogo);
    
    backgroundVan.setBounds(1,1,1280,720);
    backgroundVan.setBackground(Color.GRAY);
    backgroundVan.setLayout(null);
    vanFrame.add(backgroundVan);
    
    //motorsFrame
    scooterLogo.setBounds(670,280,256,256);
    scooterLogo.setOpaque(false);
    scooterLogo.setContentAreaFilled(false);
    scooterLogo.setBorderPainted(false);
    backgroundMotors.add(scooterLogo);
    
    underboneLogo.setBounds(300,300,200,200);
    underboneLogo.setOpaque(false);
    underboneLogo.setContentAreaFilled(false);
    underboneLogo.setBorderPainted(false);
    backgroundMotors.add(underboneLogo);
    
    backbuttonMotors.setBounds(1100,630,100,30);
    backbuttonMotors.setOpaque(false);
    backbuttonMotors.setContentAreaFilled(false);
    backbuttonMotors.setBorderPainted(false);
    backbuttonMotors.setForeground(Color.BLACK);
    backgroundMotors.add(backbuttonMotors);
    
    underboneLabel.setBounds(350,500,200,100);
    underboneLabel.setFont(new Font("Arial",Font.BOLD,25));
    underboneLabel.setForeground(Color.BLACK);
    backgroundMotors.add(underboneLabel);   
    
    showroomLogoMotors.setBounds(1,1,256,144);
    backgroundMotors.add(showroomLogoMotors);
    
    scooterLabel.setBounds(750,500,100,100);
    scooterLabel.setFont(new Font("Arial",Font.BOLD,25));
    scooterLabel.setForeground(Color.BLACK);
    backgroundMotors.add(scooterLabel);
     
    nameAccMotors.setBounds(250,25,500,100);
    nameAccMotors.setFont(new Font("Arial",Font.BOLD,25));
    nameAccMotors.setForeground(Color.WHITE);
    backgroundMotors.add(nameAccMotors);
    
    //logoMenu.setBounds(1,1,256,144);
   // backgroundMotors.add(logoMenu); //lipat moto dun sa menu itapat mo rin don *pati yung jpanel yun din
    
    backgroundMotors.setBounds(1,1,1280,720);
    backgroundMotors.setBackground(Color.GRAY);
    backgroundMotors.setLayout(null);
    motorsFrame.add(backgroundMotors);
   
    //underbone Frame
    sniperunderboneButton.setBounds(250,130,256,262);
    sniperunderboneButton.setOpaque(false);
    sniperunderboneButton.setContentAreaFilled(false);
    sniperunderboneButton.setBorderPainted(false);
    backgroundUnderbone.add(sniperunderboneButton);
    
    sniperName.setBounds(340,330,200,100);
    sniperName.setFont(new Font("Arial",Font.BOLD,18));
    sniperName.setForeground(Color.BLACK);
    sniperName.setVisible(false);
    backgroundUnderbone.add(sniperName);
    
    sniperDescription.setBounds(320,400,300,30);
    sniperDescription.setFont(new Font("Arial",Font.BOLD,12));
    sniperDescription.setForeground(Color.BLACK);
    sniperDescription.setLineWrap(true);
    sniperDescription.setWrapStyleWord(true);
    sniperDescription.setBackground(Color.GRAY);
    sniperDescription.setVisible(false);
    sniperDescription.setEditable(false);
    backgroundUnderbone.add(sniperDescription);
    
    sniperpriceText.setBounds(350,420,200,100);
    sniperpriceText.setFont(new Font("Arial",Font.BOLD,25));
    sniperpriceText.setForeground(Color.BLACK);
    sniperpriceText.setVisible(false);
    backgroundUnderbone.add(sniperpriceText); 
    
    sniperbuyButton.setBounds(430,500,100,30);
    sniperbuyButton.setOpaque(false);
    sniperbuyButton.setContentAreaFilled(false);
    sniperbuyButton.setBorderPainted(false);
    sniperbuyButton.setVisible(false);
    sniperbuyButton.setForeground(Color.BLACK);
    backgroundUnderbone.add(sniperbuyButton);
    
    sniperconfirmButton.setBounds(430,500,100,30);
    sniperconfirmButton.setOpaque(false);
    sniperconfirmButton.setContentAreaFilled(false);
    sniperconfirmButton.setBorderPainted(false);
    sniperconfirmButton.setVisible(false);
    sniperconfirmButton.setForeground(Color.BLACK);
    backgroundUnderbone.add(sniperconfirmButton);
    
    supraunderboneButton.setBounds(750,130,256,262);
    supraunderboneButton.setOpaque(false);
    supraunderboneButton.setContentAreaFilled(false);
    supraunderboneButton.setBorderPainted(false);
    backgroundUnderbone.add(supraunderboneButton);
    
    supraName.setBounds(850,330,200,100);
    supraName.setFont(new Font("Arial",Font.BOLD,18));
    supraName.setForeground(Color.BLACK);
    supraName.setVisible(false);
    backgroundUnderbone.add(supraName);
    
    supraDescription.setBounds(850,400,300,30);
    supraDescription.setFont(new Font("Arial",Font.BOLD,12));
    supraDescription.setForeground(Color.BLACK);
    supraDescription.setLineWrap(true);
    supraDescription.setWrapStyleWord(true);
    supraDescription.setBackground(Color.GRAY);
    supraDescription.setVisible(false);
    supraDescription.setEditable(false);
    backgroundUnderbone.add(supraDescription);
    
    suprapriceText.setBounds(880,420,200,100);
    suprapriceText.setFont(new Font("Arial",Font.BOLD,25));
    suprapriceText.setForeground(Color.BLACK);
    suprapriceText.setVisible(false);
    backgroundUnderbone.add(suprapriceText); 
    
    suprabuyButton.setBounds(1000,500,100,30);
    suprabuyButton.setOpaque(false);
    suprabuyButton.setContentAreaFilled(false);
    suprabuyButton.setBorderPainted(false);
    suprabuyButton.setVisible(false);
    suprabuyButton.setForeground(Color.BLACK);
    backgroundUnderbone.add(suprabuyButton);
    
    supraconfirmButton.setBounds(1000,500,100,30);
    supraconfirmButton.setOpaque(false);
    supraconfirmButton.setContentAreaFilled(false);
    supraconfirmButton.setBorderPainted(false);
    supraconfirmButton.setVisible(false);
    supraconfirmButton.setForeground(Color.BLACK);
    backgroundUnderbone.add(supraconfirmButton);
    
    
    backbuttonUnderbone.setBounds(1100,630,100,30);
    backbuttonUnderbone.setOpaque(false);
    backbuttonUnderbone.setContentAreaFilled(false);
    backbuttonUnderbone.setBorderPainted(false);
    backbuttonUnderbone.setForeground(Color.BLACK);
    backgroundUnderbone.add(backbuttonUnderbone);
    
    nameAccUnderbone.setBounds(250,25,500,100);
    nameAccUnderbone.setFont(new Font("Arial",Font.BOLD,25));
    nameAccUnderbone.setForeground(Color.WHITE);
    backgroundUnderbone.add(nameAccSedan);
    
    showroomunderboneLogo.setBounds(1,1,256,144);
    backgroundUnderbone.add(showroomunderboneLogo);
    
    backgroundUnderbone.setBounds(1,1,1280,720);
    backgroundUnderbone.setBackground(Color.GRAY);
    backgroundUnderbone.setLayout(null);
    underboneFrame.add(backgroundUnderbone);
    
    //scooter Frame
    mioscooterButton.setBounds(250,130,256,239);
    mioscooterButton.setOpaque(false);
    mioscooterButton.setContentAreaFilled(false);
    mioscooterButton.setBorderPainted(false);
    backgroundScooter.add(mioscooterButton);
    
    mioName.setBounds(340,330,200,100);
    mioName.setFont(new Font("Arial",Font.BOLD,18));
    mioName.setForeground(Color.BLACK);
    mioName.setVisible(false);
    backgroundScooter.add(mioName);
    
    mioDescription.setBounds(320,400,300,30);
    mioDescription.setFont(new Font("Arial",Font.BOLD,12));
    mioDescription.setForeground(Color.BLACK);
    mioDescription.setLineWrap(true);
    mioDescription.setWrapStyleWord(true);
    mioDescription.setBackground(Color.GRAY);
    mioDescription.setVisible(false);
    mioDescription.setEditable(false);
    backgroundScooter.add(mioDescription);
    
    miopriceText.setBounds(350,420,200,100);
    miopriceText.setFont(new Font("Arial",Font.BOLD,25));
    miopriceText.setForeground(Color.BLACK);
    miopriceText.setVisible(false);
    backgroundScooter.add(miopriceText); 
    
    miobuyButton.setBounds(430,500,100,30);
    miobuyButton.setOpaque(false);
    miobuyButton.setContentAreaFilled(false);
    miobuyButton.setBorderPainted(false);
    miobuyButton.setVisible(false);
    miobuyButton.setForeground(Color.BLACK);
    backgroundScooter.add(miobuyButton);
    
    mioconfirmButton.setBounds(430,500,100,30);
    mioconfirmButton.setOpaque(false);
    mioconfirmButton.setContentAreaFilled(false);
    mioconfirmButton.setBorderPainted(false);
    mioconfirmButton.setVisible(false);
    mioconfirmButton.setForeground(Color.BLACK);
    backgroundScooter.add(mioconfirmButton);
    
    dioscooterButton.setBounds(750,130,256,271);
    dioscooterButton.setOpaque(false);
    dioscooterButton.setContentAreaFilled(false);
    dioscooterButton.setBorderPainted(false);
    backgroundScooter.add(dioscooterButton);
    
    dioName.setBounds(850,330,200,100);
    dioName.setFont(new Font("Arial",Font.BOLD,18));
    dioName.setForeground(Color.BLACK);
    dioName.setVisible(false);
    backgroundScooter.add(dioName);
    
    dioDescription.setBounds(850,400,300,30);
    dioDescription.setFont(new Font("Arial",Font.BOLD,12));
    dioDescription.setForeground(Color.BLACK);
    dioDescription.setLineWrap(true);
    dioDescription.setWrapStyleWord(true);
    dioDescription.setBackground(Color.GRAY);
    dioDescription.setVisible(false);
    dioDescription.setEditable(false);
    backgroundScooter.add(dioDescription);
    
    diopriceText.setBounds(880,420,200,100);
    diopriceText.setFont(new Font("Arial",Font.BOLD,25));
    diopriceText.setForeground(Color.BLACK);
    diopriceText.setVisible(false);
    backgroundScooter.add(diopriceText); 
    
    diobuyButton.setBounds(1000,500,100,30);
    diobuyButton.setOpaque(false);
    diobuyButton.setContentAreaFilled(false);
    diobuyButton.setBorderPainted(false);
    diobuyButton.setVisible(false);
    diobuyButton.setForeground(Color.BLACK);
    backgroundScooter.add(diobuyButton);
    
    dioconfirmButton.setBounds(1000,500,100,30);
    dioconfirmButton.setOpaque(false);
    dioconfirmButton.setContentAreaFilled(false);
    dioconfirmButton.setBorderPainted(false);
    dioconfirmButton.setVisible(false);
    dioconfirmButton.setForeground(Color.BLACK);
    backgroundScooter.add(dioconfirmButton);
    
    backbuttonScooter.setBounds(1100,630,100,30);
    backbuttonScooter.setOpaque(false);
    backbuttonScooter.setContentAreaFilled(false);
    backbuttonScooter.setBorderPainted(false);
    backbuttonScooter.setForeground(Color.BLACK);
    backgroundScooter.add(backbuttonScooter);
    
    nameAccScooter.setBounds(250,25,500,100);
    nameAccScooter.setFont(new Font("Arial",Font.BOLD,25));
    nameAccScooter.setForeground(Color.WHITE);
    backgroundScooter.add(nameAccScooter);
    
    showroomscooterLogo.setBounds(1,1,256,144);
    backgroundScooter.add(showroomscooterLogo);
    
    backgroundScooter.setBounds(1,1,1280,720);
    backgroundScooter.setBackground(Color.GRAY);
    backgroundScooter.setLayout(null);
    scooterFrame.add(backgroundScooter);
    
    //orderForm
    nameTable.setBounds(310,130,200,100);
    nameTable.setFont(new Font("Arial",Font.BOLD,15));
    nameTable.setForeground(Color.WHITE);
    nameTable.setVisible(true);
    orderformBackground.add(nameTable);
    
    quantityTable.setBounds(450,130,200,100);
    quantityTable.setFont(new Font("Arial",Font.BOLD,15));
    quantityTable.setForeground(Color.WHITE);
    quantityTable.setVisible(true);
    orderformBackground.add(quantityTable);
    
    priceTable.setBounds(630,130,200,100);
    priceTable.setFont(new Font("Arial",Font.BOLD,15));
    priceTable.setForeground(Color.WHITE);
    priceTable.setVisible(true);
    orderformBackground.add(priceTable);
    
    transmissionTable.setBounds(750,130,200,100);
    transmissionTable.setFont(new Font("Arial",Font.BOLD,15));
    transmissionTable.setForeground(Color.WHITE);
    transmissionTable.setVisible(true);
    orderformBackground.add(transmissionTable);
    
    addfeesTable.setBounds(900,130,200,100);
    addfeesTable.setFont(new Font("Arial",Font.BOLD,15));
    addfeesTable.setForeground(Color.WHITE);
    addfeesTable.setVisible(true);
    orderformBackground.add(addfeesTable);
    
    homeButton.setBounds(1100,200,100,30);
    homeButton.setOpaque(false);
    homeButton.setContentAreaFilled(false);
    homeButton.setBorderPainted(false);
    homeButton.setForeground(Color.BLACK);
    orderformBackground.add(homeButton);
    
    totalText.setBounds(1100,200,200,100);
    totalText.setFont(new Font("Arial",Font.BOLD,15));
    totalText.setForeground(Color.WHITE);
    totalText.setVisible(true);
    orderformBackground.add(totalText);
    
    totalTextfield.setBounds(1150,235,80,20);
    totalTextfield.setBackground(Color.WHITE);
    totalTextfield.setForeground(Color.BLACK);
    totalTextfield.setVisible(true);
    totalTextfield.setEditable(false);
    orderformBackground.add(totalTextfield);
    
    vatText.setBounds(1100,230,200,100);
    vatText.setFont(new Font("Arial",Font.BOLD,15));
    vatText.setForeground(Color.WHITE);
    vatText.setVisible(true);
    orderformBackground.add(vatText);
    
    vatTextfield.setBounds(1150,270,80,20);
    vatTextfield.setBackground(Color.WHITE);
    vatTextfield.setForeground(Color.BLACK);
    vatTextfield.setVisible(true);
    vatTextfield.setEditable(false);
    orderformBackground.add(vatTextfield);
    
    discountText.setBounds(1070,260,200,100);
    discountText.setFont(new Font("Arial",Font.BOLD,15));
    discountText.setForeground(Color.WHITE);
    discountText.setVisible(true);
    orderformBackground.add(discountText);
    
    discountTextfield.setBounds(1150,300,80,20);
    discountTextfield.setFont(new Font("Arial",Font.BOLD,15));
    discountTextfield.setForeground(Color.WHITE);
    discountTextfield.setVisible(true);
    discountTextfield.setEditable(false);
    orderformBackground.add(discountTextfield);
    
    gtamountText.setBounds(1060,290,200,100);
    gtamountText.setFont(new Font("Arial",Font.BOLD,15));
    gtamountText.setForeground(Color.WHITE);
    gtamountText.setVisible(true);
    orderformBackground.add(gtamountText);
    
    gtaTextfield.setBounds(1170,330,80,20);
    gtaTextfield.setFont(new Font("Arial",Font.BOLD,15));
    gtaTextfield.setForeground(Color.WHITE);
    gtaTextfield.setVisible(true);
    gtaTextfield.setEditable(false);
    orderformBackground.add(gtaTextfield);
    
    amounttenderedText.setBounds(1060,320,200,100);
    amounttenderedText.setFont(new Font("Arial",Font.BOLD,15));
    amounttenderedText.setForeground(Color.WHITE);
    amounttenderedText.setVisible(true);
    orderformBackground.add(amounttenderedText);
    
    amounttenderedTextfield.setBounds(1185,360,80,20);
    amounttenderedTextfield.setFont(new Font("Arial",Font.BOLD,10));
    amounttenderedTextfield.setForeground(Color.BLACK);
    amounttenderedTextfield.setVisible(true);
    amounttenderedTextfield.setEditable(true);
    orderformBackground.add(amounttenderedTextfield);
    
    changeText.setBounds(1060,350,200,100);
    changeText.setFont(new Font("Arial",Font.BOLD,15));
    changeText.setForeground(Color.WHITE);
    changeText.setVisible(true);
    orderformBackground.add(changeText);
    
    changeTextfield.setBounds(1130,390,80,20);
    changeTextfield.setFont(new Font("Arial",Font.BOLD,15));
    changeTextfield.setForeground(Color.WHITE);
    changeTextfield.setVisible(true);
    changeTextfield.setEditable(false);
    orderformBackground.add(changeTextfield);
    
    confirmorderButton.setBounds(1100,600,100,30);
    confirmorderButton.setOpaque(false);
    confirmorderButton.setContentAreaFilled(false);
    confirmorderButton.setBorderPainted(false);
    confirmorderButton.setForeground(Color.BLACK);
    orderformBackground.add(confirmorderButton);
    
    orderForm.setBounds(250,200,800,400); 
    orderForm.setEnabled(false);
    orderformBackground.add(orderForm);
    
    orderformLogo.setBounds(500,1,256,144);
    orderformBackground.add(orderformLogo);
    
    
    orderformBackground.setBounds(1,1,1280,720);
    orderformBackground.setBackground(Color.GRAY);
    orderformBackground.setLayout(null);
    orderformFrame.add(orderformBackground);
    
    
    
    
    
    introFrame.setSize(1280,720);
    introFrame.setLayout(null);
    introFrame.setVisible(true);
    introFrame.setLocationRelativeTo(null);
    introFrame.setResizable(false);
    introFrame.setDefaultCloseOperation(introFrame.EXIT_ON_CLOSE);
    
    menuFrame.setSize(1280,720);
    menuFrame.setLayout(null);
    menuFrame.setVisible(false);
    menuFrame.setLocationRelativeTo(null);
    menuFrame.setResizable(false);
    menuFrame.setDefaultCloseOperation(menuFrame.EXIT_ON_CLOSE);
    
    carsFrame.setSize(1280,720);
    carsFrame.setLayout(null);
    carsFrame.setVisible(false);
    carsFrame.setLocationRelativeTo(null);
    carsFrame.setResizable(false);
    carsFrame.setDefaultCloseOperation(carsFrame.EXIT_ON_CLOSE);
     
    sedanFrame.setSize(1280,720);
    sedanFrame.setLayout(null);
    sedanFrame.setVisible(false);
    sedanFrame.setLocationRelativeTo(null);
    sedanFrame.setResizable(false);
    sedanFrame.setDefaultCloseOperation(sedanFrame.EXIT_ON_CLOSE);
    
    SUVFrame.setSize(1280,720);
    SUVFrame.setLayout(null);
    SUVFrame.setVisible(false);
    SUVFrame.setLocationRelativeTo(null);
    SUVFrame.setResizable(false);
    SUVFrame.setDefaultCloseOperation(SUVFrame.EXIT_ON_CLOSE);
    
    vanFrame.setSize(1280,720);
    vanFrame.setLayout(null);
    vanFrame.setVisible(false);
    vanFrame.setLocationRelativeTo(null);
    vanFrame.setResizable(false);
    vanFrame.setDefaultCloseOperation(vanFrame.EXIT_ON_CLOSE);
    
    motorsFrame.setSize(1280,720);
    motorsFrame.setLayout(null);
    motorsFrame.setVisible(false);
    motorsFrame.setLocationRelativeTo(null);
    motorsFrame.setResizable(false);
    motorsFrame.setDefaultCloseOperation(motorsFrame.EXIT_ON_CLOSE);
    
    underboneFrame.setSize(1280,720);
    underboneFrame.setLayout(null);
    underboneFrame.setVisible(false);
    underboneFrame.setLocationRelativeTo(null);
    underboneFrame.setResizable(false);
    underboneFrame.setDefaultCloseOperation(underboneFrame.EXIT_ON_CLOSE);
    
    scooterFrame.setSize(1280,720);
    scooterFrame.setLayout(null);
    scooterFrame.setVisible(false);
    scooterFrame.setLocationRelativeTo(null);
    scooterFrame.setResizable(false);
    scooterFrame.setDefaultCloseOperation(scooterFrame.EXIT_ON_CLOSE);
    
    orderformFrame.setSize(1280,720);
    orderformFrame.setLayout(null);
    orderformFrame.setBackground(Color.GRAY);
    orderformFrame.setVisible(false);
    orderformFrame.setLocationRelativeTo(null);
    orderformFrame.setResizable(false);
    orderformFrame.setDefaultCloseOperation(scooterFrame.EXIT_ON_CLOSE);
    
    
    
    
    
   //Login Frame
    logo.addActionListener(this);
    loginButton.addActionListener(this);
    //menu Frame
    cars.addActionListener(this);
    sedanLogo.addActionListener(this);
    SUVLogo.addActionListener(this);
    vanLogo.addActionListener(this);
    
    motors.addActionListener(this);
    underboneLogo.addActionListener(this);
    scooterLogo.addActionListener(this);
    //cars Frame
    backbuttonCars.addActionListener(this);
    //motorsFrame
    backbuttonMotors.addActionListener(this);
    //sedanFrame
    backbuttonSedan.addActionListener(this);
    civicsedanButton.addActionListener(this);
    viossedanButton.addActionListener(this);
    civicbuyButton.addActionListener(this);
    civicconfirmButton.addActionListener(this);
    civicAutomatic.addActionListener(this);
    civicManual.addActionListener(this);
    viosbuyButton.addActionListener(this);
    viosconfirmButton.addActionListener(this);
    viosAutomatic.addActionListener(this);
    viosManual.addActionListener(this);
    //SUVFrame
    monterosuvButton.addActionListener(this);
    monterobuyButton.addActionListener(this);
    monteroconfirmButton.addActionListener(this);
    monteroAutomatic.addActionListener(this);
    monteroManual.addActionListener(this);
    
    crvsuvButton.addActionListener(this);
    crvsuvButton.addActionListener(this);
    crvbuyButton.addActionListener(this);
    crvconfirmButton.addActionListener(this);
    crvAutomatic.addActionListener(this);
    crvManual.addActionListener(this);
    
    backbuttonSUV.addActionListener(this);
    //vanFrame
    hiacevanButton.addActionListener(this);
    hiacebuyButton.addActionListener(this);
    hiaceconfirmButton.addActionListener(this);
    hiaceAutomatic.addActionListener(this);
    hiaceManual.addActionListener(this);
    
    chevyvanButton.addActionListener(this);
    chevybuyButton.addActionListener(this);
    chevyconfirmButton.addActionListener(this);
    chevyAutomatic.addActionListener(this);
    chevyManual.addActionListener(this);
    
    backbuttonVan.addActionListener(this);
    //underboneFrame
    sniperunderboneButton.addActionListener(this);
    sniperbuyButton.addActionListener(this);
    sniperconfirmButton.addActionListener(this);
    
    supraunderboneButton.addActionListener(this);
    suprabuyButton.addActionListener(this);
    supraconfirmButton.addActionListener(this);
    
    backbuttonUnderbone.addActionListener(this);
    //ScooterFrame
     mioscooterButton.addActionListener(this);
    miobuyButton.addActionListener(this);
    mioconfirmButton.addActionListener(this);
    
    dioscooterButton.addActionListener(this);
    diobuyButton.addActionListener(this);
    dioconfirmButton.addActionListener(this);
    
    backbuttonScooter.addActionListener(this);
    //orderForm Frame
    homeButton.addActionListener(this);
    confirmorderButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e ){
        //login Frame
        if (e.getSource()== logo){
            userlabel.setVisible(true);
            passlabel.setVisible(true);
            user.setVisible(true);
            pass.setVisible(true);
            loginButton.setVisible(true);
                    }
        
        if(e.getSource()== loginButton){
              String un=user.getText();
               String passw=pass.getText();
               if (un.equalsIgnoreCase(username) && passw.equalsIgnoreCase(password)) {
                           JOptionPane.showMessageDialog(null, "Log-in Successful!");
                           user.setText("");
                           pass.setText("");
                           introFrame.setVisible(false);
                           menuFrame.setVisible(true);
                            } 
                     
                     else {
                         user.setText("");
                         pass.setText("");
                    JOptionPane.showMessageDialog(null, "Log-in Failed! Try Again");
                       }
                }
        
         //menuFrame
       if (e.getSource()== cars){
           menuFrame.setVisible(false);
           carsFrame.setVisible(true);
       }
       
       //sedan
       if (e.getSource()== sedanLogo){
           carsFrame.setVisible(false);
           sedanFrame.setVisible(true);
       }
       
       if(e.getSource()==civicsedanButton){
           civicName.setVisible(true);
           civicDescription.setVisible(true);
           civicpriceText.setVisible(true);
           civicbuyButton.setVisible(true);
           
           viosName.setVisible(false);
           viosDescription.setVisible(false);
           viospriceText.setVisible(false);
           viosbuyButton.setVisible(false);
           viostransmissionPick.setVisible(false);
           viosAutomatic.setVisible(false);
           viosManual.setVisible(false);
           viosaddFee.setVisible(false);
           viosconfirmButton.setVisible(false);
       }
       
       if(e.getSource()==civicbuyButton){
           civictransmissionPick.setVisible(true);
           civicAutomatic.setVisible(true);
           civicManual.setVisible(true);
           civicconfirmButton.setVisible(true);
           civicbuyButton.setVisible(false);
       }
       
        if(e.getSource()== civicconfirmButton){
            sedanFrame.setVisible(false);
            orderformFrame.setVisible(true);
            
        }
       
       if(e.getSource()==civicManual){
           civicaddFee.setVisible(true);
           transmissionpickCivic = civicManual.getText();
       }
       
        if(e.getSource()==civicAutomatic){
           civicaddFee.setVisible(false);
           transmissionpickCivic = civicManual.getText();
       }
       
       if(e.getSource()==viossedanButton){
           civicName.setVisible(false);
           civicDescription.setVisible(false);
           civicpriceText.setVisible(false);
           civictransmissionPick.setVisible(false);
           civicAutomatic.setVisible(false);
           civicManual.setVisible(false);   
           civicconfirmButton.setVisible(false);
           civicbuyButton.setVisible(false);
           civicaddFee.setVisible(false);
           
           viosbuyButton.setVisible(true);
           viosName.setVisible(true);
           viosDescription.setVisible(true);
           viospriceText.setVisible(true);
       }
       
        if(e.getSource()==viosbuyButton){
           viostransmissionPick.setVisible(true);
           viosAutomatic.setVisible(true);
           viosManual.setVisible(true);
           viosconfirmButton.setVisible(true);
           viosbuyButton.setVisible(false);
       }
        
        if(e.getSource()== viosconfirmButton){
            sedanFrame.setVisible(false);
            orderformFrame.setVisible(true);
        }
        
          if(e.getSource()==viosManual){
           viosaddFee.setVisible(false);
       }
       
        if(e.getSource()==viosAutomatic){
           viosaddFee.setVisible(true);
       }
        
       if (e.getSource()== SUVLogo){
           carsFrame.setVisible(false);
           SUVFrame.setVisible(true);
       }
       
       if(e.getSource()==monterosuvButton){
           monteroName.setVisible(true);
           monteroDescription.setVisible(true);
           monteropriceText.setVisible(true);
           monterobuyButton.setVisible(true);
           
           crvName.setVisible(false);
           crvDescription.setVisible(false);
           crvpriceText.setVisible(false);
           crvbuyButton.setVisible(false);
           crvtransmissionPick.setVisible(false);
           crvAutomatic.setVisible(false);
           crvManual.setVisible(false);
           crvaddFee.setVisible(false);
           crvconfirmButton.setVisible(false);
       }
       
        if(e.getSource()==monterobuyButton){
           monterotransmissionPick.setVisible(true);
           monteroAutomatic.setVisible(true);
           monteroManual.setVisible(true);
           monteroconfirmButton.setVisible(true);
           monterobuyButton.setVisible(false);
       }
       
         if(e.getSource()==monteroManual){
           monteroaddFee.setVisible(true);
           transmissionpickMontero = monteroManual.getText();
       }
       
        if(e.getSource()==monteroAutomatic){
           civicaddFee.setVisible(false);
           transmissionpickMontero = monteroManual.getText();
       }
        
        if(e.getSource()== monteroconfirmButton){
            SUVFrame.setVisible(false);
            orderformFrame.setVisible(true);
            
        }
       
       if(e.getSource()==crvsuvButton){
           crvName.setVisible(true);
           crvDescription.setVisible(true);
           crvpriceText.setVisible(true);
           crvbuyButton.setVisible(true);
           
           monteroName.setVisible(false);
           monteroDescription.setVisible(false);
           monteropriceText.setVisible(false);
           monterobuyButton.setVisible(false);
           monterotransmissionPick.setVisible(false);
           monteroAutomatic.setVisible(false);
           monteroManual.setVisible(false);
           monteroaddFee.setVisible(false);
           monteroconfirmButton.setVisible(false);
       }
       
        if(e.getSource()==crvbuyButton){
           crvtransmissionPick.setVisible(true);
           crvAutomatic.setVisible(true);
           crvManual.setVisible(true);
           crvconfirmButton.setVisible(true);
           crvbuyButton.setVisible(false);
       }
       
         if(e.getSource()==crvManual){
           crvaddFee.setVisible(false);
           transmissionpickCrv = crvManual.getText();
       }
       
        if(e.getSource()==crvAutomatic){
           crvaddFee.setVisible(true);
           transmissionpickCrv = crvManual.getText();
       }
        
        if(e.getSource()== crvconfirmButton){
            SUVFrame.setVisible(false);
            orderformFrame.setVisible(true);
            
        }
       
       if (e.getSource()== vanLogo){
           carsFrame.setVisible(false);
           vanFrame.setVisible(true);
       }
       
         if(e.getSource()==hiacevanButton){
           hiaceName.setVisible(true);
           hiaceDescription.setVisible(true);
           hiacepriceText.setVisible(true);
           hiacebuyButton.setVisible(true);
           
           chevyName.setVisible(false);
           chevyDescription.setVisible(false);
           chevypriceText.setVisible(false);
           chevybuyButton.setVisible(false);
           chevytransmissionPick.setVisible(false);
           chevyAutomatic.setVisible(false);
           chevyManual.setVisible(false);
           chevyaddFee.setVisible(false);
           chevyconfirmButton.setVisible(false);
       }
       
        if(e.getSource()==hiacebuyButton){
           hiacetransmissionPick.setVisible(true);
           hiaceAutomatic.setVisible(true);
           hiaceManual.setVisible(true);
           hiaceconfirmButton.setVisible(true);
           hiacebuyButton.setVisible(false);
       }
       
         if(e.getSource()==hiaceManual){
           hiaceaddFee.setVisible(true);
           transmissionpickCrv = hiaceManual.getText();
       }
       
        if(e.getSource()==hiaceAutomatic){
           hiaceaddFee.setVisible(false);
           transmissionpickCrv = hiaceAutomatic.getText();
       }
        
        if(e.getSource()== hiaceconfirmButton){
            SUVFrame.setVisible(false);
            orderformFrame.setVisible(true);
            
        }
        
          if(e.getSource()==chevyvanButton){
           chevyName.setVisible(true);
           chevyDescription.setVisible(true);
           chevypriceText.setVisible(true);
           chevybuyButton.setVisible(true);
           
           hiaceName.setVisible(false);
           hiaceDescription.setVisible(false);
           hiacepriceText.setVisible(false);
           hiacebuyButton.setVisible(false);
           hiacetransmissionPick.setVisible(false);
           hiaceAutomatic.setVisible(false);
           hiaceManual.setVisible(false);
           hiaceaddFee.setVisible(false);
           hiaceconfirmButton.setVisible(false);
       }
       
        if(e.getSource()==chevybuyButton){
          chevytransmissionPick.setVisible(true);
           chevyAutomatic.setVisible(true);
           chevyManual.setVisible(true);
           chevyconfirmButton.setVisible(true);
           chevybuyButton.setVisible(false);
       }
       
         if(e.getSource()==chevyManual){
           chevyaddFee.setVisible(true);
           transmissionpickChevy = chevyManual.getText();
       }
       
        if(e.getSource()==chevyAutomatic){
           chevyaddFee.setVisible(false);
           transmissionpickChevy = chevyAutomatic.getText();
       }
        
        if(e.getSource()== chevyconfirmButton){
            vanFrame.setVisible(false);
            orderformFrame.setVisible(true);
            
        }
       
       if (e.getSource()== motors){
           menuFrame.setVisible(false);
           motorsFrame.setVisible(true);
       }
       
        if (e.getSource()== underboneLogo){
           motorsFrame.setVisible(false);
           underboneFrame.setVisible(true);
       }
        
           if(e.getSource()==sniperunderboneButton){
           sniperName.setVisible(true);
           sniperDescription.setVisible(true);
           sniperpriceText.setVisible(true);
           sniperbuyButton.setVisible(true);
           
           supraName.setVisible(false);
           supraDescription.setVisible(false);
           suprapriceText.setVisible(false);
           suprabuyButton.setVisible(false);
           supraconfirmButton.setVisible(false);
       }
         
           if(e.getSource()==sniperbuyButton){
       
           sniperconfirmButton.setVisible(true);
           sniperbuyButton.setVisible(false);
       }  
          
           if(e.getSource()==sniperconfirmButton){
       
           underboneFrame.setVisible(false);
           orderformFrame.setVisible(true);
       }  
           
         if(e.getSource()==supraunderboneButton){
           supraName.setVisible(true);
           supraDescription.setVisible(true);
           suprapriceText.setVisible(true);
           suprabuyButton.setVisible(true);
           
           sniperName.setVisible(false);
           sniperDescription.setVisible(false);
           sniperpriceText.setVisible(false);
           sniperbuyButton.setVisible(false);
           sniperconfirmButton.setVisible(false);
       }   
         
         if(e.getSource()==suprabuyButton){
           supraconfirmButton.setVisible(true);
           suprabuyButton.setVisible(false);
       }  
         
          if(e.getSource()==supraconfirmButton){
       
           underboneFrame.setVisible(false);
           orderformFrame.setVisible(true);
       }  
        
         if (e.getSource()== scooterLogo){
           motorsFrame.setVisible(false);
           scooterFrame.setVisible(true);
       }
         
           if(e.getSource()==mioscooterButton){
           mioName.setVisible(true);
           mioDescription.setVisible(true);
           miopriceText.setVisible(true);
           miobuyButton.setVisible(true);
           
           dioName.setVisible(false);
           dioDescription.setVisible(false);
           diopriceText.setVisible(false);
           diobuyButton.setVisible(false);
           dioconfirmButton.setVisible(false);
       }
         
           if(e.getSource()==miobuyButton){
       
           mioconfirmButton.setVisible(true);
           miobuyButton.setVisible(false);
       }  
          
           if(e.getSource()==mioconfirmButton){
       
           scooterFrame.setVisible(false);
           orderformFrame.setVisible(true);
       }  
           
         if(e.getSource()==dioscooterButton){
           dioName.setVisible(true);
           dioDescription.setVisible(true);
           diopriceText.setVisible(true);
           diobuyButton.setVisible(true);
           
           mioName.setVisible(false);
           mioDescription.setVisible(false);
           miopriceText.setVisible(false);
           miobuyButton.setVisible(false);
           mioconfirmButton.setVisible(false);
       }   
         
         if(e.getSource()==diobuyButton){
           dioconfirmButton.setVisible(true);
           diobuyButton.setVisible(false);
       }  
         
          if(e.getSource()==dioconfirmButton){
       
           scooterFrame.setVisible(false);
           orderformFrame.setVisible(true);
       }  
         
         
       //carsFrame
       if (e.getSource()== backbuttonCars){
           carsFrame.setVisible(false);
           menuFrame.setVisible(true);
       }
       
        if (e.getSource()== backbuttonMotors){
           motorsFrame.setVisible(false);
           menuFrame.setVisible(true);
       }
        if (e.getSource()== backbuttonSedan){
           sedanFrame.setVisible(false);
           carsFrame.setVisible(true);
           
            civicName.setVisible(false);
           civicDescription.setVisible(false);
           civicpriceText.setVisible(false);
           civictransmissionPick.setVisible(false);
           civicAutomatic.setVisible(false);
           civicManual.setVisible(false);
           civicconfirmButton.setVisible(false);
           civicbuyButton.setVisible(false);
           civicaddFee.setVisible(false);
           
           viosbuyButton.setVisible(false);
           viosName.setVisible(false);
           viosDescription.setVisible(false);
           viospriceText.setVisible(false);
           viostransmissionPick.setVisible(false);
           viosAutomatic.setVisible(false);
           viosManual.setVisible(false);
           viosconfirmButton.setVisible(false);
           
       }
        
        if (e.getSource()== backbuttonSUV){
           SUVFrame.setVisible(false);
           carsFrame.setVisible(true);
       }
        if (e.getSource()== backbuttonVan){
           vanFrame.setVisible(false);
           carsFrame.setVisible(true);
       }
        if (e.getSource()== backbuttonUnderbone){
           underboneFrame.setVisible(false);
           motorsFrame.setVisible(true);
       }
        if (e.getSource()== backbuttonScooter){
           scooterFrame.setVisible(false);
           motorsFrame.setVisible(true);
       }
        
        if(e.getSource()== homeButton){
            orderformFrame.setVisible(false);
            menuFrame.setVisible(true);     
        }
        if(e.getSource()==confirmorderButton){
            JOptionPane.showMessageDialog(null,"Thank you for purchasing!");
            orderformFrame.setVisible(false);
            introFrame.setVisible(true);
        }
        
    }
    
    
    public static void main(String[] args) {
         // TODO code application logic here
          new theShowroom();
     
  
}
}