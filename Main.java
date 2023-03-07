import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.io.UnsupportedEncodingException;
import java.awt.event.*;



class MyFrame extends JLabel {
    MyFrame(String str) {
        super(str);
        // this.
    }
}

public class Main extends DefaultTableCellRenderer implements ActionListener {


    
    
    static JFrame frame = new JFrame("Hayavadana");    
    static Icon image;
    static JButton squareSubmit, cubeSubmit;
    static JLabel nSqLabel, aSqLabel, dSqLabel, nCbLabel;
    static JLabel sqHeader, cbHeader, sqRes, cbRes;
    static JTextField nSqTField, aSqTField, dSqTField, nCbTField; 
    // static JTextArea dataItemText;
    // static JPanel myDisplay = new JPanel();

    public static void addNewFrame1() {

        JFrame squareAndCube = new JFrame("squareAndCube");
        // JButton squareSubmit, cubeSubmit;
        // JLabel nSqLabel, aSqLabel, dSqLabel, nCbLabel;
        // JLabel sqHeader, cbHeader;
        // JTextField nSqTField, aSqTField, dSqTField, nCbTField; 

        squareAndCube.getContentPane().setBackground( Color.decode("#FFF9EE") );
        squareAndCube.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        squareAndCube.setSize(1233, 733); 
        squareAndCube.setLayout(null);  

        // for square
        sqHeader = new JLabel("Sum of Squares of n Terms:");
        sqHeader.setBounds(82, 150, 360, 35);
        sqHeader.setForeground(Color.decode("#075466"));
        sqHeader.setFont(new Font("Segoe UI Semibold", Font.BOLD , 21));
        JSeparator js = new JSeparator(HORIZONTAL);

        nSqLabel = new JLabel("Number of Terms:");
        nSqLabel.setBounds(89, 250, 160, 22);
        nSqLabel.setForeground(Color.decode("#075466"));
        nSqLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD , 18));

        dSqLabel = new JLabel("Common Diff:");
        dSqLabel.setBounds(89, 292, 160, 22);
        dSqLabel.setForeground(Color.decode("#075466"));
        dSqLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD , 18));

        aSqLabel = new JLabel("First term:");
        aSqLabel.setBounds(89, 334, 160, 22);
        aSqLabel.setForeground(Color.decode("#075466"));
        aSqLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD , 18));

        nSqTField = new JTextField();
        nSqTField.setBounds(289, 250, 118, 35);
        dSqTField = new JTextField();        
        dSqTField.setBounds(289, 292, 118, 35);
        aSqTField = new JTextField();
        aSqTField.setBounds(289, 334, 118, 35);

        squareSubmit = new JButton("Submit");
        squareSubmit.setBounds(500, 292, 118, 35);
        squareSubmit.addActionListener(new Main());

        sqRes = new JLabel();
        sqRes.setBounds(625, 292, 75, 30);

        
        squareAndCube.add(sqHeader);
        squareAndCube.add(nSqLabel);
        squareAndCube.add(dSqLabel);
        squareAndCube.add(aSqLabel);
        squareAndCube.add(js);
        squareAndCube.add(nSqTField);
        squareAndCube.add(dSqTField);
        squareAndCube.add(aSqTField);
        squareAndCube.add(squareSubmit);
        squareAndCube.add(sqRes);
                

        // For cube
        cbHeader = new JLabel("Sum of Cubes:\n");
        cbHeader.setBounds(90, 400, 360, 35);
        cbHeader.setForeground(Color.decode("#075466"));
        cbHeader.setFont(new Font("Segoe UI Semibold", Font.BOLD , 21));

        nCbLabel = new JLabel("Number of Terms:\n");
        nCbLabel.setBounds(90, 440, 360, 35);
        nCbLabel.setForeground(Color.decode("#075466"));
        nCbLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD , 18));
        
        
        nCbTField = new JTextField();
        nCbTField.setBounds(289, 440, 118, 35);
        cubeSubmit = new JButton("Submit");
        cubeSubmit.setBounds(500, 440, 118, 35);
        cubeSubmit.addActionListener(new Main());
        cbRes = new JLabel();
        cbRes.setBounds(625, 440, 75, 30);

        squareAndCube.add(nCbLabel);
        squareAndCube.add(cbHeader);
        squareAndCube.add(nCbTField);
        squareAndCube.add(cubeSubmit);
        squareAndCube.add(cbRes);
        squareAndCube.setVisible(true);          
    }

    public static void addButtons(JPanel p, int x, int y) {
        // int width, height;
        for(int i = x; i <= 20; i++) {
            JButton b = new JButton("Kamala Srinivas");
            b.setBounds(x, y + i*20 + 5, 48, 20);
            p.add(b);
        }
        // JScrollPane sp =new JScrollPane(p); 
        p.setVisible(true);

    }

    public static void addTable(JPanel view) {
        Image i;
        String data[][]={ 
            {"001","Madhavan's Sine, Cosine"},    
            {"002","Sum of Square"},   
            {"003","Sum of Cubes"}
        };    
        String column[]={"ID","NAME"};         
        final JTable jt=new JTable(data,column);   
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Madhavan's Sine, Cosine", 1);
        hm.put("Sum of Square", 2);
        hm.put("Sum of Cubes", 3);
        
        jt.setFont(new Font("Segoe UI", Font.BOLD , 18));
        // JScrollPane scrollPane = new JScrollPane(jt);
        jt.setCellSelectionEnabled(true);  
        ListSelectionModel select= jt.getSelectionModel();  
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  

        jt.setRowHeight(24);
        
        select.addListSelectionListener(new ListSelectionListener() {  
            public void valueChanged(ListSelectionEvent e) {  
            String Data = null;  
            int[] row = jt.getSelectedRows();  
            int[] columns = jt.getSelectedColumns();  
        //                for (int i = 0; i < row.length; i++) {  
        //                  for (int j = 0; j < columns.length; j++) {  
        //                    Data = (String) jt.getValueAt(row[i], columns[j]);  
        //                  } }  

            Data = (String) jt.getValueAt(row[row.length - 1], columns[columns.length - 1]);
            
            myfun(Data, hm.get(Data));  
        }

        });  
        JScrollPane sp=new JScrollPane(jt); 
        // TODO: Add table
        view.add(sp);
        view.setVisible(true);
    }

    private static Object String(java.lang.String string) {
        return null;
    }

    public static void myfun(String Data, int key) {
        JLabel dataItemText = new JLabel(Data);  
        dataItemText.setBackground(Color.decode("#B7D6DD"));
        // myDisplay.setBackground(Color.decode("#B7D6DD"));
        dataItemText.setBounds(767, 150, 60, 20);
        dataItemText.setFont(new Font("Segoe UI", Font.BOLD , 18));
        // myDisplay.add(dataItemText);
        // frame.add(dataItemText);
        JFrame f = new JFrame();
        image = new ImageIcon("D:\\College\\Java\\images\\"+ key +".png");
            JLabel jl = new JLabel(image);
            System.out.println("Table element selected is: " + Data);    
            f.setBounds(767, 150, 349, 449);
            f.add(jl);
            f.setVisible(true);
        switch(key) {
            case 1: 
                addNewFrame1();
                break;
            case 2: 
                addNewFrame1();
                break;
            default: 
                addNewFrame1();
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Srimathe Ramanujaya Nama:");
        sandbox();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == squareSubmit) {
            System.out.println("Kamala Srinivas");
                       
            int n = Integer.valueOf(nSqTField.getText());
            int a = Integer.valueOf(aSqTField.getText());
            int d = Integer.valueOf(dSqTField.getText());            
            float m=(float)((((2*n)-1)*Math.pow(d,2)))/6;
            m+=a*d;
            m*=(n-1);
            m+=Math.pow(a, 2);
            m*=n;
            float sum=m;
            System.out.println(sum);    
            String s = String.valueOf(sum);  
            sqRes.setText(s);        
        }

        else {
            int n = Integer.valueOf(nCbTField.getText());
            float sum=(n*(n+1))/2;
		    sum=sum*sum;
            System.out.println(sum);    
            String s = String.valueOf(sum);  
            cbRes.setText(s); 
        }
    }

    public static void sandbox() {

        frame.getContentPane().setBackground( Color.decode("#FFF9EE") );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1233, 733); 
        frame.setLayout(null);  

        JLabel title;  
        title = new JLabel("Lilavati ");  
        title.setBounds(112,66, 195,50);  
        title.setForeground(Color.decode("#075466"));
        title.setFont(new Font("Segoe UI Semibold", Font.BOLD , 40));
        frame.add(title);
        
        title = new JLabel("Hayavadana");  
        title.setBounds(986,86, 175,50);  
        title.setForeground(Color.decode("#D90166"));
        title.setFont(new Font("Segoe UI Semibold", Font.BOLD , 26));
        frame.add(title);
        
        // tabbed pane
        JTabbedPane tp=new JTabbedPane();  
        tp.setBounds(52,120,592,515);
        tp.setFont(new Font("Segoe", Font.CENTER_BASELINE, 20));
        tp.setBackground(Color.decode("#FFF9EE"));
        // individual panes


        // About
        JPanel about =new JPanel();  
        about.setBackground(Color.decode("#FFF9EE")); 
        String at = "Lilavati is a treatise on mathematics by the Indian mathematician Bhaskara II, written in 1150. It is the first volume of his main work, the Siddhanta Shiromani, alongside the Bijaganita, the Grahaganita, and the Goladhyaya. There is a legend that says that Bhaskara composed this text for his daughter, who was called Lilavati.  The book contains thirteen chapters, mainly definitions, arithmetical terms, interest computation, arithmetical and geometrical progressions, plane geometry, solid geometry, the shadow of the gnomon, the Kuttaka - a method to solve indeterminate equations, and combinations. Lilavati includes a number of methods of computing numbers such as multiplications, squares, and progressions, with examples using kings and elephants, objects which a common man could understand.";
        JTextArea aboutText = new JTextArea(at);  
        aboutText.setBackground(Color.decode("#FFF9EE"));
        aboutText.setBounds(126, 265, 468, 449);
        aboutText.setLineWrap(true);
        aboutText.setFont(new Font("Segoe UI", Font.BOLD , 18));
        about.add(aboutText);

        // // action
        // JPanel action = new JPanel();
        // addNewFrame1();
        
        // view
        JPanel view =new JPanel();  
        addTable(view);
        // addButtons(view, 114, 241);

        // info
        JPanel info=new JPanel();  
        info.setBackground(Color.decode("#FFF9EE"));
        // TODO: Add Info
        String it = "Bhāskara II (c. 1114–1185), also known as Bhāskarāchārya ('Bhāskara, the teacher'), and as Bhāskara II to avoid confusion with Bhāskara I, was an Indian mathematician and astronomer. From verses, in his main work, Siddhānta Shiromani (सिद्धांतशिरोमणी), it can be inferred that he was born in 1114 in Vijjadavida (Vijjalavida) and living in the Sahyadri mountain ranges of Western Ghats, believed to be the town of Patan in Chalisgaon, located in present-day Khandesh region of Maharashtra by scholars.[6] He is the only ancient mathematician who has been immortalized on a monument. In a temple in Maharashtra, an inscription supposedly created by his grandson Changadeva, lists Bhaskaracharya's ancestral lineage for several generations before him as well as two generations after him.[7][8] Colebrooke who was the first European to translate (1817) Bhaskaracharya II's mathematical classics refers to the family as Maharashtrian Brahmins residing on the banks of the Godavari.";
        JTextArea infoText = new JTextArea(it);  
        infoText.setBackground(Color.decode("#FFF9EE"));
        infoText.setBounds(126, 265, 468, 449);
        infoText.setLineWrap(true);
        infoText.setFont(new Font("Segoe UI", Font.BOLD , 18));
        info.add(infoText);


        tp.add("About", about);  
        tp.add("View", view);  
        tp.add("Background Info", info);    
        // tp.add("Actions", action);


        frame.add(tp);
        frame.setVisible(true);  
    }

}