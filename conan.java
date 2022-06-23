package conan;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.*;

public class conan extends JFrame {
	
	Image image;
	
	Font Name = new Font ("American Typewriter", Font.BOLD | Font.ITALIC, 40);
	String car = "DETECTIVE CONAN";
	
	conan() {
	
		image = new ImageIcon("LightBrown.png").getImage();
		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2D = (Graphics2D)g;
		
		//g.setColor(new Color(51-153-255)); // ITO PWEDE PO PANG BACKGROUND KASO PANGIT PO KULAY
		//g.fillRect(0, 0, 500, 600); 
		
		g2D.drawImage(image,0,0,null); // HEHEHE SIR GUMAMIT NA LANG PO AKO NG IMAGE FOR SKIN COLOR PO WALANG LIGHT BROWN PO
		
		g2D.setPaint(new GradientPaint(230,40, Color.ORANGE,100,100, Color.RED, true));
		g2D.fill(new Rectangle2D.Double(25,480,450,100));
		g.setColor(Color.BLACK);
		g.setFont(Name);
		g.drawString(car, 35, 540);
		
		// hair
		g.setColor(Color.BLACK);
		g.fillRect(213, 79, 80, 11); //9
		g.fillRect(185, 86, 129, 9); //8
		g.fillRect(165, 93, 169, 9); //7
		g.fillRect(79, 100, 58, 9); //6
		g.fillRect(405, 78, 7, 6); // end oh hair 5 |
		g.fillRect(399, 78, 6, 20); // end oh hair 4 |
		g.fillRect(391, 70, 8, 45); // end oh hair 3 |
		g.fillRect(384, 70, 7, 56); // end oh hair 2 |
		g.fillRect(371, 65, 13, 80); // end oh hair |
		g.fillRect(150, 100, 200, 9); //5
		g.fillRect(64, 107, 292, 9); //5
		g.fillRect(54, 114, 310, 9); //4 ===
		g.fillRect(411, 120, 16, 7); // 3.3 -
		g.fillRect(398, 126, 22, 7); // 3.2 -
		g.fillRect(96, 127, 27, 112); // 3.1 |
		g.fillRect(47, 121, 27, 8); //3
		g.fillRect(39, 128, 20, 9); //2
		g.fillRect(82, 133, 330, 9); // 2.1 -
		g.fillRect(31, 135, 14, 9); //1
		g.fillRect(398, 140, 8, 8); // -
		g.fillRect(46, 184, 7, 42); // + 1 |
		g.fillRect(53, 170, 7, 69); // + 2 |
		g.fillRect(60, 156, 7, 62); // + 3 |
		g.fillRect(66, 149, 8, 63); // + 4 |
		g.fillRect(74, 142, 14, 112); // + 5 |
		g.fillRect(88, 142, 8, 76); // + 6 |
		g.fillRect(80, 254, 15, 15); // + 7 |
		g.fillRect(102, 238, 21, 30); // + 8 |
		g.fillRect(88, 268, 21, 6); // + 9 |
		g.fillRect(116, 262, 15, 20);
		g.fillRect(95, 273, 15, 15);
		g.fillRect(88, 282, 7, 43);
		g.fillRect(103, 283, 15, 27); 
		g.fillRect(118, 290, 6, 6);
		g.fillRect(124, 282, 7, 21); 
		g.fillRect(95, 310, 7, 21);
		g.fillRect(123, 168, 58, 8); // -
		g.fillRect(123, 173, 16, 10); // - 2
		g.fillRect(123, 179, 8, 20); // -
		g.fillRect(123, 218, 29, 15); // -
		g.fillRect(145, 176, 20, 8); // - 2.1
		g.fillRect(173, 176, 8, 8); // - 2.2
		g.fillRect(165, 182, 8, 45); // |
		g.fillRect(138, 182, 21, 16); // -
		g.fillRect(138, 192, 16, 20); // |
		g.fillRect(131, 210, 21, 8); // -
		g.fillRect(142, 205, 45, 8); // -
		g.fillRect(123, 168, 58, 8); // - 
		g.fillRect(398, 162, 8, 8); // -
		g.fillRect(187, 168, 219, 8); // -
		g.fillRect(187, 175, 64, 31); // -
		g.fillRect(195, 198, 80, 20); // -
		g.fillRect(180, 212, 240, 7); // -
		g.fillRect(195, 217, 70, 8); // -
		g.fillRect(151, 225, 45, 8); // -
		g.fillRect(151, 232, 30, 8); // - ----
		g.fillRect(215, 239, 14, 8); // - .
		g.fillRect(235, 239, 45, 8); // - ..
		g.fillRect(221, 246, 59, 8); // - .
		g.fillRect(215, 254, 8, 8); // - '
		g.fillRect(230, 254, 29, 8); // - ''
		g.fillRect(270, 254, 17, 8); // - '''
		g.fillRect(251, 260, 7, 30); // | "
		g.fillRect(258, 286, 7, 18); // | "
		g.fillRect(264, 303, 8, 8); // - eye g
		g.fillRect(271, 310, 8, 8); // - 
		g.fillRect(277, 317, 16, 8); // - 
		g.fillRect(117, 304, 7, 14); // |
		g.fillRect(295, 324, 62, 8); // - end
		g.fillRect(356, 311, 8, 16); // |
		g.fillRect(363, 286, 8, 26); // |
		g.fillRect(363, 276, 16, 16); // |
		g.fillRect(356, 261, 8, 16); // |
		g.fillRect(349, 254, 8, 8); // |
		
		g.setColor(Color.WHITE);
		g.fillRect(138, 240, 49, 25);//EYE white
		g.fillRect(131, 262, 63, 28);//EYE DOWN
		g.fillRect(137, 289, 21, 8);//EYE D
		g.fillRect(144, 296, 23, 8);//EYE D
		
		g.fillRect(321, 248, 28, 17);//EYE r
		g.fillRect(314, 262, 42, 16);//EYE 
		g.fillRect(298, 269, 65, 15);//EYE 
		g.fillRect(298, 281, 65, 16);//EYE 
		g.fillRect(342, 296, 16, 8);//EYE 
		g.fillRect(337, 304, 16, 8);//EYE 
		
		g.setColor(Color.CYAN);
		g.fillRect(159, 261, 9, 35);//EYE B
		g.fillRect(159, 279, 14, 8);// - 2
		g.fillRect(299, 289, 8, 8);// 2.1
		g.fillRect(161, 287, 27, 9);// - 3
		g.fillRect(307, 297, 30, 9);// - 3.1
		g.fillRect(329, 289, 8, 8);// - 4
		
		g.setColor(Color.BLACK);
		g.fillRect(279, 219, 8, 8); // - 1.1
		g.fillRect(300, 219, 26, 8); // -1.2
		g.fillRect(258, 176, 21, 30); // | 2
		g.fillRect(278, 176, 135, 16); // - 3
		g.fillRect(306, 247, 15, 7); // - 1 EYE
		g.fillRect(335, 247, 14, 7); // - 1.1
		g.fillRect(299, 254, 30, 7); // - 2
		g.fillRect(299, 261, 15, 8); // - 3
		g.fillRect(328, 261, 7, 8); // - 3.1
		g.fillRect(293, 268, 7, 29); // | 4
		g.fillRect(307, 269, 7, 7); // - 4.1
		g.fillRect(335, 268, 7, 36); // | 4.2
		g.fillRect(300, 283, 7, 7); // - 5
		g.fillRect(328, 283, 7, 7); // - 5.1
		g.fillRect(305, 290, 25, 7); // - 6
		g.fillRect(300, 297, 7, 7); // - 7
		g.fillRect(307, 304, 30, 7); // - 8
		
		g.fillRect(215, 304, 8, 21); // - NOSE
		g.fillRect(221, 311, 8, 7); // - 1
		g.fillRect(230, 318, 7, 8); // - 2
		g.fillRect(221, 325, 15, 7); // - 3
		
		g.setColor(Color.PINK);
		g.fillRect(200, 344, 87, 30); // 1
		g.fillRect(208, 374, 71, 21); // 2
		
		g.setColor(Color.BLACK);
		g.fillRect(194, 339, 99, 7); // - SMILE
		g.fillRect(194, 344, 7, 30); // | 1
		g.fillRect(286, 344, 7, 30); // | 1.1
		g.fillRect(201, 374, 7, 16); // | 2
		g.fillRect(279, 374, 7, 16); // | 2.1
		g.fillRect(208, 388, 7, 7); // - 3
		g.fillRect(272, 388, 7, 7); // - 3.1
		g.fillRect(215, 395, 57, 7); // - 4 END
		g.fillRect(285, 191, 128, 7); // - 4
		g.fillRect(293, 198, 21, 7); // - 5
		g.fillRect(328, 198, 92, 7); // - 5.1
		g.fillRect(293, 205, 29, 7); // - 6
		g.fillRect(328, 205, 92, 7); // - 6.1
		g.fillRect(335, 219, 85, 7); // - 7
		g.fillRect(349, 225, 14, 8); // - 8
		g.fillRect(371, 225, 49, 8); // - 9
		g.fillRect(356, 231, 64, 24); // - 10
		g.fillRect(370, 251, 7, 20); // | 11
		g.fillRect(385, 255, 35, 7); // - 11.1
		g.fillRect(385, 260, 29, 15); // - 12
		g.fillRect(370, 269, 20, 14); // - 13
		g.fillRect(300, 232, 50, 8); // -
		g.fillRect(307, 240, 50, 8); // -
		
		g.fillRect(136, 239, 16, 8); // - 1 eyes
		g.fillRect(180, 239, 8, 8); // - 1.5 -
		g.fillRect(130, 246, 8, 19); // | 2
		g.fillRect(165, 246, 30, 8); // - 2.5
		g.fillRect(159, 253, 14, 8); // - 3
		g.fillRect(186, 254, 8, 8); // - 3.5
		g.fillRect(152, 260, 7, 30); // | 4
		g.fillRect(166, 260, 7, 23); // | 4.2
		g.fillRect(194, 260, 7, 23); // | 4.3
		g.fillRect(170, 282, 24, 7); // - 5
		g.fillRect(158, 289, 8, 8); // - 6
		g.fillRect(187, 289, 8, 8); // - 6.5
		g.fillRect(166, 296, 21, 8); // - 7
		g.fillRect(201, 225, 15, 8); // - 1 eyeglass
		g.fillRect(220, 225, 112, 8); // - 2
		g.fillRect(194, 232, 28, 8); // - 3
		g.fillRect(230, 232, 43, 8); // - 3.1
		g.fillRect(207, 238, 8, 52); // - 4
		g.fillRect(200, 285, 8, 20); // | 5
		g.fillRect(194, 304, 8, 8); // - 6
		g.fillRect(186, 310, 8, 8); // - 7
		g.fillRect(171, 317, 16, 8); // - 8
		g.fillRect(138, 324, 35, 8); // - 9 end
		
		g.fillRect(95, 330, 14, 9); // - 1
		g.fillRect(103, 338, 14, 9); // - 2
		g.fillRect(109, 346, 14, 9); // - 3
		g.fillRect(113, 353, 31, 10); // - 4
		g.fillRect(102, 311, 7, 7); // - 1.1
		g.fillRect(109, 318, 7, 7); // - 1.2
		g.fillRect(116, 325, 7, 7); // - 1.3
		g.fillRect(370, 304, 7, 14); // - 1.3.1
		g.fillRect(385, 274, 7, 18); // | 1.3.UP
		g.fillRect(399, 290, 7, 7); // - 1.3.UP1
		g.fillRect(385, 296, 7, 7); // - 1.3.UP3
		g.fillRect(377, 318, 7, 7); // | 1.3.UP4
		g.fillRect(378, 290, 7, 21); // | 1.3.2 KANAN
		g.fillRect(392, 290, 7, 35); // | 1.3.3
		g.fillRect(370, 311, 7, 14); // | 1.3 
		g.fillRect(364, 325, 7, 14); // | 1.4 --
		g.fillRect(385, 325, 7, 14); // | 1.4.1
		g.fillRect(357, 339, 7, 14); // | 1.5
		g.fillRect(378, 339, 7, 7); // | 1.5.1
		g.fillRect(364, 345, 14, 7); // - 1.6
		g.fillRect(350, 353, 14, 8); // - 2
		g.fillRect(350, 359, 7, 8); // - 3
		g.fillRect(342, 367, 7, 8); // - 4
		g.fillRect(335, 374, 45, 7); // - 5
		g.fillRect(329, 381, 20, 7); // - 6
		g.fillRect(322, 388, 34, 7); // - 7
		g.fillRect(315, 395, 55, 7); // - 8
		g.fillRect(298, 402, 25, 7); // - 9
		g.fillRect(286, 410, 15, 7); // - 10
		g.fillRect(265, 417, 25, 7); // - 11
		g.fillRect(195, 424, 85, 7); // - 12 End
		g.fillRect(406, 275, 14, 7); // | EAR KANAN
		g.fillRect(413, 282, 7, 45); // | 1
		g.fillRect(406, 325, 14, 7); // - 2
		g.fillRect(406, 325, 7, 19); // | 3
		g.fillRect(399, 339, 13, 7); // - 4
		g.fillRect(399, 339, 7, 20); // | 6
		g.fillRect(392, 351, 14, 7); // - 7
		g.fillRect(392, 358, 7, 8); // | 8
		g.fillRect(385, 360, 14, 7); // - 9
		g.fillRect(369, 367, 24, 7); // - 10
		
		g.fillRect(123, 318, 8, 7); // - 1.4
		g.fillRect(123, 332, 8, 7); // - 1.5
		g.fillRect(130, 303, 8, 43); // - 1.6
		g.fillRect(137, 345, 8, 8); // - 1.7
		g.fillRect(131, 360, 20, 8); // - 1.8
		g.fillRect(145, 366, 7, 15); // | BABA
		g.fillRect(152, 373, 7, 15); // | 1
		g.fillRect(159, 379, 7, 16); // | 2
		g.fillRect(166, 389, 7, 14); // | 3
		g.fillRect(173, 396, 7, 14); // | 4
		g.fillRect(180, 402, 15, 7); // - 5
		g.fillRect(187, 409, 24, 9); // - 6
		g.fillRect(200, 417, 30, 7); // - 7 END
		g.fillRect(110, 133, 288, 38); //BUHOK
		g.fillRect(110, 120, 264, 25);
		
		g.setColor(Color.RED); 
		g.fillRect(200, 430, 64, 29); // | RIBBON
		g.fillRect(283, 430, 45, 29); // | RIBBON
		g.fillRect(262, 437, 21, 22); // | RIBBON
		
		g.setColor(Color.BLUE); 
		g.fillRect(157, 445, 16, 14); // | BODY
		g.fillRect(180, 431, 21, 28); // | 1
		g.fillRect(313, 412, 20, 47); // - 2
		g.fillRect(330, 422, 14, 37); // | 3
		g.fillRect(344, 426, 10, 33); // | 4
		g.fillRect(354, 431, 21, 28); // | 5
		g.fillRect(377, 444, 16, 15); // - 2
		
		
		g.setColor(Color.BLACK); 
		g.fillRect(152, 445, 7, 14); // | KATAWAN
		g.fillRect(159, 438, 7, 14); // | 1
		g.fillRect(159, 438, 20, 7); // - 2
		g.fillRect(173, 434, 7, 25); // | 3
		g.fillRect(174, 430, 27, 7); // - 4
		g.fillRect(215, 430, 50, 7); // - 4.1
		g.fillRect(279, 430, 7, 7); // - 4.2
		g.fillRect(314, 430, 8, 7); // - 4.3
		g.fillRect(349, 430, 21, 7); // - 4.4
		g.fillRect(201, 437, 7, 22); // | 5
		g.fillRect(229, 437, 50, 7); // - 5.2
		g.fillRect(307, 437, 7, 22); // | 5.3
		g.fillRect(342, 437, 7, 14); // | 5.4
		g.fillRect(370, 430, 7, 29); // | 5.5
		g.fillRect(377, 437, 14, 7); // - 5.6
		g.fillRect(236, 444, 7, 15); // | 6
		g.fillRect(265, 444, 7, 15); // | 6.1
		g.fillRect(385, 444, 7, 9); // | 6.2
		g.fillRect(208, 450, 7, 9); // | 7
		g.fillRect(236, 444, 7, 8); // | 8
		g.fillRect(300, 451, 7, 8); // | 9
		g.fillRect(335, 451, 7, 8); // | 10
		g.fillRect(391, 444, 7, 15); // | 11
		g.fillRect(285, 423, 36, 7); // - 12
		g.fillRect(335, 423, 20, 7); // - 13
		g.fillRect(307, 409, 7, 15); // | 14
		g.fillRect(307, 409, 25, 7); // - 13
		g.fillRect(328, 409, 7, 10); // |14
		g.fillRect(328, 416, 15, 7); // - 15
		
	
	}
		public static void main (String[] args) {
			new conan ();
	}
	
}