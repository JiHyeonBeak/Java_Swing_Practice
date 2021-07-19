package Game;

import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GameService {
	
	public void start(Game g) {
		GameService gs = new GameService();
		JFrame frm = new JFrame("시뮬레이션 게임");
		frm.setSize(500,500);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frm.getContentPane().setLayout(null);
		
		frm.setVisible(true);
		
		
		JButton btn1 = new JButton("시작");
		JButton btn2 = new JButton("종료");
		
		btn1.setBounds(100, 300, 122, 30);
		btn2.setBounds(270, 300, 122, 30);
		
		frm.getContentPane().add(btn1);
		frm.getContentPane().add(btn2);
		
		btn1.addActionListener(event -> {
			gs.set(frm,g);
		});	
		btn2.addActionListener(event -> {
			System.exit(0);
		});	
		
		frm.setResizable(false);
		
	}
		
		public void set(JFrame frm,Game g) {	
			
			
		GameService gs = new GameService();

		frm.getContentPane().removeAll();
		frm.revalidate();
		frm.repaint();  
		g.name = JOptionPane.showInputDialog("당신의 이름은?");
		JLabel lbl = new JLabel();
		lbl.setBounds(120, 100, 122, 30);
		lbl.setText("이름 : " + g.name );	
		frm.getContentPane().add(lbl);
		
		JButton woman = new JButton("여성");
		JButton man = new JButton("남성");
		JButton skinny = new JButton("마름");
		JButton fat = new JButton("뚱뚱함");
		JButton st = new JButton("출발한다");
		
		st.setBounds(350, 50, 122, 30);
		woman.setBounds(100, 200, 122, 30);
		man.setBounds(250, 200, 122, 30);
		skinny.setBounds(100, 250, 122, 30);
		fat.setBounds(250, 250, 122, 30);
		
		frm.getContentPane().add(woman);
		frm.getContentPane().add(man);
		frm.getContentPane().add(skinny);
		frm.getContentPane().add(fat);
		frm.getContentPane().add(st);
		JLabel gd = new JLabel();
		JLabel bd = new JLabel();
		bd.setBounds(300,100,122,30);
		gd.setBounds(250, 100, 122, 30);
		frm.getContentPane().add(bd);
		frm.getContentPane().add(gd);	
		
		woman.addActionListener(event -> {
				g.setGender(true);
				gd.setText("여성");

		});
		man.addActionListener(event -> {
				g.setGender(false);
				gd.setText("남성");

		});
		
		skinny.addActionListener(event -> {
				g.setBody(true);
				bd.setText("날씬함");

		});
		
		fat.addActionListener(event -> {
				g.setBody(false);
				bd.setText("뚱뚱함");
	
		});
		st.addActionListener(event -> {
			gs.game1(frm,g);
		});
		

		
		}

		private void game1(JFrame frm,Game g) {
			frm.getContentPane().removeAll();
			frm.revalidate();
			frm.repaint();
			
			GameService gs = new GameService();
			Random rd = new Random();
			g.setDE(rd.nextInt(2));
			
			JButton con1 = new JButton("인사한다");
			con1.setBounds(190, 330, 122, 30);
			frm.getContentPane().add(con1);
			
			
			if(g.getDE()==1) {
			JOptionPane.showMessageDialog(null,"건국이가 미팅장소에 나왔다.");
			if(g.isBody() && g.isGender() ) {
				
				gs.eriho(frm);
				
				JLabel con = new JLabel();
				con.setBounds(200, 200, 300, 30);
				con.setHorizontalAlignment(JLabel.CENTER);
				con.setText("안녕하세요.");
				frm.getContentPane().add(con);
				g.point = g.point + 1;
				
			}
				
				else {
					
					gs.eri(frm);
					
					JLabel con = new JLabel();
					con.setBounds(200, 200, 300, 30);
					con.setHorizontalAlignment(JLabel.CENTER);
					con.setText("안녕하세요...");
					frm.getContentPane().add(con);
					
					
					
				}
						
			}
			
			else {
				JOptionPane.showMessageDialog(null, "고앵이가 미팅장소에 나왔다.");
				
				if(!g.isBody() && !g.isGender() ) {
					
					gs.gayho(frm);
					
					JLabel con = new JLabel();
					con.setBounds(200,200, 300, 30);
					con.setHorizontalAlignment(JLabel.CENTER);
					con.setText("(뚱뚱하네)...안녕하세요.");
					frm.getContentPane().add(con);
					g.point = g.point + 1;

					}
				

				else{

					gs.gay(frm);
					
					JLabel con = new JLabel();
					con.setBounds(200, 200, 300, 30);
					con.setHorizontalAlignment(JLabel.CENTER);
					con.setText("...");
					frm.getContentPane().add(con);

					
				}	
				
			}
			
			con1.addActionListener(event -> {
				gs.game2(frm,g);
			});
			
			
			
		}
		
		public void game2(JFrame frm, Game g) {
			
			frm.getContentPane().removeAll();
			frm.revalidate();
			frm.repaint();
			
			GameService gs = new GameService();
			
			JButton con1 = new JButton("감탄한다");
			con1.setBounds(100, 330, 122, 30);
			frm.getContentPane().add(con1);
			
			JButton con2 = new JButton("비웃는다");
			con2.setBounds(270, 330, 122, 30);
			frm.getContentPane().add(con2);
			
			if(g.getDE()==1) {
				
				gs.eri(frm);
				
				JLabel con = new JLabel();
				con.setBounds(200,200, 300, 30);
				con.setHorizontalAlignment(JLabel.CENTER);
				con.setText("저 이번에 석사할거에요.");
				frm.getContentPane().add(con);
					
			}

			else {
				
				gs.gay(frm);
				
				JLabel con = new JLabel();
				con.setBounds(200,200, 300, 30);
				con.setHorizontalAlignment(JLabel.CENTER);
				con.setText("책을 쓰고 있어요...");
				frm.getContentPane().add(con);
			
			}
			
			con1.addActionListener(event -> {
				g.point = g.point+1;
				gs.game3(frm,g);
			});
			
			con2.addActionListener(event -> {
				g.point = g.point-1;
				gs.game3(frm,g);
			});
			
		}

		
		private void game3(JFrame frm, Game g) {
			frm.getContentPane().removeAll();
			frm.revalidate();
			frm.repaint();
			
			GameService gs = new GameService();
			
			JButton con1 = new JButton("역겨워한다");
			con1.setBounds(100, 330, 122, 30);
			frm.getContentPane().add(con1);
			
			JButton con2 = new JButton("대충 끄덕인다");
			con2.setBounds(270, 330, 122, 30);
			frm.getContentPane().add(con2);
			
				if(g.getDE()==1) {
				
				gs.eri(frm);
				
				JLabel con = new JLabel();
				con.setBounds(150,150, 300, 30);
				con.setHorizontalAlignment(JLabel.CENTER);
				con.setText(g.name+"씨 마음에 드네요.");
				frm.getContentPane().add(con);
					
			}

				else {
				
				gs.gay(frm);
				
				JLabel con = new JLabel();
				con.setBounds(150,150, 300, 30);
				con.setHorizontalAlignment(JLabel.CENTER);
				con.setText(g.name+"씨,제가 사실 게이에요.");
				frm.getContentPane().add(con);
			
			}
				
				con1.addActionListener(event -> {
					g.point = g.point-1;
					if(g.point == 1 || g.point == 6) {
						gs.end(frm, g);
					}
					else {
						gs.game4(frm,g);
					}
				});
				
				con2.addActionListener(event -> {
					g.point = g.point+1;
					if(g.point == 1 || g.point == 6) {
						gs.end(frm, g);
					}
					else {
						gs.game4(frm,g);
					}
				});
			
			
			
			
		}

		private void game4(JFrame frm, Game g) {
			
			frm.getContentPane().removeAll();
			frm.revalidate();
			frm.repaint();
			GameService gs = new GameService();
			
			JButton con1 = new JButton("경청한다");
			con1.setBounds(100, 330, 122, 30);
			frm.getContentPane().add(con1);
			
			JButton con2 = new JButton("뭐지..?");
			con2.setBounds(270, 330, 122, 30);
			frm.getContentPane().add(con2);
			
			if(g.getDE()==1) {
				
				gs.eri(frm);
				
				JLabel con = new JLabel();
				con.setBounds(200,150, 300, 30);
				con.setHorizontalAlignment(JLabel.CENTER);
				con.setText("심리학적으로~(어쩌구저쩌구)");
				frm.getContentPane().add(con);
					
			}

			else {
				
				gs.gay(frm);
				
				JLabel con = new JLabel();
				con.setBounds(200,200, 300, 30);
				con.setHorizontalAlignment(JLabel.CENTER);
				con.setText("양고기를 먹어야 겠어요");
				frm.getContentPane().add(con);
			
			}
			
			con1.addActionListener(event -> {
				g.point = g.point+1;
				if(g.point == 1 || g.point == 6) {
					gs.end(frm, g);
				}
				else {
					gs.game4(frm,g);
				}
				
			});
			
			con2.addActionListener(event -> {
				g.point = g.point-1;
				if(g.point == 1 || g.point == 6) {
					gs.end(frm, g);
				}
				else {
					gs.game4(frm,g);
				}
				
			});
			
			
		}
		
		private void game5(JFrame frm, Game g) {
			
			frm.getContentPane().removeAll();
			frm.revalidate();
			frm.repaint();
			GameService gs = new GameService();
			
			JButton con1 = new JButton("거절한다");
			con1.setBounds(60, 330, 122, 30);
			frm.getContentPane().add(con1);
			
			JButton con2 = new JButton("끄덕인다");
			con2.setBounds(190, 330, 122, 30);
			frm.getContentPane().add(con2);
			
			JButton con3 = new JButton("도망간다");
			con3.setBounds(320, 330, 122, 30);
			frm.getContentPane().add(con3);
			
			if(g.getDE()==1) {
				
				gs.eri(frm);
				
				JLabel con = new JLabel();
				con.setBounds(200,150, 300, 30);
				con.setHorizontalAlignment(JLabel.CENTER);
				con.setText(g.name+"님 저랑 놀러가실래요?");
				frm.getContentPane().add(con);
					
			}

			else {
				
				gs.gay(frm);
				
				JLabel con = new JLabel();
				con.setBounds(200,200, 300, 30);
				con.setHorizontalAlignment(JLabel.CENTER);
				con.setText(g.name+"씨..언제 한번 우리집으로 와요");
				frm.getContentPane().add(con);
			
			}
			
			con1.addActionListener(event -> {
				gs.run(frm,g);
			});
			
			con2.addActionListener(event -> {
				gs.bad(frm,g);
			});
			
			con3.addActionListener(event -> {
				gs.run(frm,g);
			});
			
			
		}

		private void neutral(JFrame frm, Game g) {
			frm.getContentPane().removeAll();
			frm.revalidate();
			frm.repaint();
			
			JLabel end = new JLabel();
			ImageIcon endimg = new ImageIcon(GameService.class.getResource("/Game/img/neutral.png"));
			end.setIcon(endimg);
			end.setHorizontalAlignment(JLabel.CENTER);
			end.setBounds(0, 0, 500, 500);
			frm.getContentPane().add(end);
			
			Font font = new Font("HY궁서 보통",Font.PLAIN,20);
			
			JLabel lbl1 = new JLabel();
			JLabel lbl2 = new JLabel();
			JLabel lbl3 = new JLabel();
		
			lbl1.setBounds(90, 50, 400, 200);
			lbl1.setText(g.name+"은(는) 집으로 돌아왔다.");
			lbl1.setFont(font);
			frm.getContentPane().add(lbl1);
			
			lbl3.setBounds(90, 100, 400, 200);
			lbl3.setText("저녁이나 먹자.");
			lbl3.setFont(font);
			frm.getContentPane().add(lbl3);
			
			lbl2.setBounds(90, 150, 400, 200);
			lbl2.setText("Neutral End");
			lbl2.setFont(font);
			lbl2.setHorizontalAlignment(JLabel.CENTER);
			frm.getContentPane().add(lbl2);
			
		}

		private void run(JFrame frm,Game g) {
			
			frm.getContentPane().removeAll();
			frm.revalidate();
			frm.repaint();
			
			JLabel end = new JLabel();
			ImageIcon endimg = new ImageIcon(GameService.class.getResource("/Game/img/neutral.png"));
			end.setIcon(endimg);
			end.setHorizontalAlignment(JLabel.CENTER);
			end.setBounds(0, 0, 500, 500);
			frm.getContentPane().add(end);
			
			Font font = new Font("HY궁서 보통",Font.PLAIN,20);
			
			JLabel lbl1 = new JLabel();
			JLabel lbl2 = new JLabel();
			JLabel lbl3 = new JLabel();
		
			lbl1.setBounds(90, 50, 400, 200);
			lbl1.setText(g.name+"은(는) 이상한 낌새에 도망쳤다.");
			lbl1.setFont(font);
			frm.getContentPane().add(lbl1);
			
			lbl3.setBounds(90, 100, 400, 200);
			lbl3.setText("도망쳐서 저녁이나 먹으러 갔다.");
			lbl3.setFont(font);
			frm.getContentPane().add(lbl3);
			
			lbl2.setBounds(90, 150, 400, 200);
			lbl2.setText("Neutral End");
			lbl2.setFont(font);
			lbl2.setHorizontalAlignment(JLabel.CENTER);
			frm.getContentPane().add(lbl2);
			
		}

		private void end(JFrame frm, Game g) {
			frm.getContentPane().removeAll();
			frm.revalidate();
			frm.repaint();
			GameService gs = new GameService();
			
			if(g.point == 1) {
				
				if(g.getDE()==1) {
				
					gs.eri(frm);
					
					JButton con1 = new JButton("집에간다");
					con1.setBounds(190, 330, 122, 30);
					frm.getContentPane().add(con1);
				
					JLabel con = new JLabel();
					con.setBounds(150,150, 300, 30);
					con.setHorizontalAlignment(JLabel.CENTER);
					con.setText("6시 뉴스를 봐야해서...");
					frm.getContentPane().add(con);
					
					con1.addActionListener(event -> {
						
						gs.neutral(frm, g);
					
					});
					
				}
				
				else {
					
					JLabel gay = new JLabel();
					ImageIcon gayimg = new ImageIcon(GameService.class.getResource("/Game/img/cafe.png"));
					gay.setIcon(gayimg);
					gay.setBounds(100, 100, 300, 200);
					gay.setHorizontalAlignment(JLabel.CENTER);
					frm.getContentPane().add(gay);
					
					JButton con1 = new JButton("집에간다");
					con1.setBounds(190, 330, 122, 30);
					frm.getContentPane().add(con1);
					
					JLabel con = new JLabel();
					con.setBounds(150,150, 300, 30);
					con.setHorizontalAlignment(JLabel.CENTER);
					con.setText("(갑자기 일어나서 카페를 나갔다)");
					frm.getContentPane().add(con);
					
					con1.addActionListener(event -> {
						
						gs.neutral(frm, g);
					
					});
	
				}
				
			}
			else if(g.point == 6) {
				
				if(g.getDE()==1) {
					
					gs.eriho(frm);
					
					JButton con1 = new JButton("따라간다");
					con1.setBounds(190, 330, 122, 30);
					frm.getContentPane().add(con1);
				
					JLabel con = new JLabel();
					con.setBounds(150,150, 300, 30);
					con.setHorizontalAlignment(JLabel.CENTER);
					con.setText(g.name+"씨 밀크티 좋아하세요?");
					frm.getContentPane().add(con);
					
					con1.addActionListener(event -> {
						gs.bad(frm,g);
					});
					
				}
				
				else {
					
					if(!g.isBody() && !g.isGender()) {
					gs.gayho(frm);
					
					JButton con1 = new JButton("따라간다");
					con1.setBounds(190, 330, 122, 30);
					frm.getContentPane().add(con1);
					
					JLabel con = new JLabel();
					con.setBounds(100,150, 300, 30);
					con.setHorizontalAlignment(JLabel.CENTER);
					con.setText("양고기와 빅맥 사드릴게요.");
					frm.getContentPane().add(con);
					
					
					con1.addActionListener(event -> {
						gs.bad(frm,g);
					});
					
					}
					
					else if(!g.isGender()) {
						
						gs.gayho(frm);
						
						JButton con1 = new JButton("따라간다");
						con1.setBounds(190, 330, 122, 30);
						frm.getContentPane().add(con1);
						
						JLabel con = new JLabel();
						con.setBounds(150,150, 300, 30);
						con.setHorizontalAlignment(JLabel.CENTER);
						con.setText("양고기 사드릴게요.");
						frm.getContentPane().add(con);
						
						con1.addActionListener(event -> {
							gs.bad(frm,g);
						});
					
					}
					
					else {
						gs.gay(frm);
						
						JButton con1 = new JButton("집에간다");
						con1.setBounds(190, 330, 122, 30);
						frm.getContentPane().add(con1);
						
						JLabel con = new JLabel();
						con.setBounds(150,150, 300, 30);
						con.setHorizontalAlignment(JLabel.CENTER);
						con.setText("오늘 재밌었어요...");
						frm.getContentPane().add(con);
						
						con1.addActionListener(event -> {
							gs.neutral(frm, g);
							
						});
					}
				}
				
			}
			
			
			
		}

		private void bad(JFrame frm, Game g) {
			
			frm.getContentPane().removeAll();
			frm.revalidate();
			frm.repaint();
			
			JLabel end = new JLabel();
			ImageIcon endimg = new ImageIcon(GameService.class.getResource("/Game/img/bad.png"));
			end.setIcon(endimg);
			end.setHorizontalAlignment(JLabel.CENTER);
			end.setBounds(0, 0, 500, 500);
			frm.getContentPane().add(end);
			
			Font font = new Font("HY궁서 보통",Font.PLAIN,20);
			
			JLabel lbl1 = new JLabel();
			JLabel lbl2 = new JLabel();
		
			lbl1.setBounds(90, 50, 400, 200);
			lbl1.setText(g.name+"은(는) 당했다.");
			lbl1.setFont(font);
			frm.getContentPane().add(lbl1);
			
			lbl2.setBounds(90, 100, 400, 200);
			lbl2.setText("Bad End");
			lbl2.setFont(font);
			lbl2.setHorizontalAlignment(JLabel.CENTER);
			frm.getContentPane().add(lbl2);
			
			
		}

		public void gay(JFrame frm) {  
				
				JLabel gay = new JLabel();
				ImageIcon gayimg = new ImageIcon(GameService.class.getResource("/Game/img/gayce.png"));
				gay.setIcon(gayimg);
				gay.setBounds(100, 100, 300, 200);
				gay.setHorizontalAlignment(JLabel.CENTER);
				frm.getContentPane().add(gay);
				
			}
		public void gayho(JFrame frm) {
			
			JLabel gay = new JLabel();
			ImageIcon gayimg = new ImageIcon(GameService.class.getResource("/Game/img/gayce_ho.png"));
			gay.setIcon(gayimg);
			gay.setBounds(100, 100, 300, 200);
			gay.setHorizontalAlignment(JLabel.CENTER);
			frm.getContentPane().add(gay);
			
		}
		public void eri(JFrame frm) {
			
			JLabel gay = new JLabel();
			ImageIcon gayimg = new ImageIcon(GameService.class.getResource("/Game/img/eriyu.png"));
			gay.setIcon(gayimg);
			gay.setBounds(100, 100, 300, 200);
			gay.setHorizontalAlignment(JLabel.CENTER);
			frm.getContentPane().add(gay);
			
		}
		public void eriho(JFrame frm) {
			
			JLabel gay = new JLabel();
			ImageIcon gayimg = new ImageIcon(GameService.class.getResource("/Game/img/eriyu_ho.png"));
			gay.setIcon(gayimg);
			gay.setBounds(100, 100, 300, 200);
			gay.setHorizontalAlignment(JLabel.CENTER);
			frm.getContentPane().add(gay);
			
		}
		
		
		
		}


