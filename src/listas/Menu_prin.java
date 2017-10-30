package listas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class Menu_prin extends JFrame 
{

	private JPanel contentPane;
	public listaDoble ld=new listaDoble();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Menu_prin frame = new Menu_prin();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu_prin() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 268);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textInactiveText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNodoFrente = new JButton("Inserta Nodo al Frente ");
		btnNodoFrente.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
			    nodoFrente nf =new nodoFrente();
			    nf.setVisible(true);
				dispose();
			}
		});
		btnNodoFrente.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 15));
		btnNodoFrente.setBounds(36, 24, 252, 33);
		contentPane.add(btnNodoFrente);
		
		JButton btnInsertaNodoAl = new JButton("Inserta Nodo al Final ");
		btnInsertaNodoAl.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				 nodoUltimo nu =new nodoUltimo();
				    nu.setVisible(true);
					dispose();
			}
		});
		btnInsertaNodoAl.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 15));
		btnInsertaNodoAl.setBounds(310, 24, 252, 33);
		contentPane.add(btnInsertaNodoAl);
		
		JButton btnEliminaNP = new JButton("Elimina Nodo Principio ");
		btnEliminaNP.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			  
			ld.eliminarFirst();
			
			}
		});
		btnEliminaNP.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 14));
		btnEliminaNP.setBounds(36, 94, 252, 33);
		contentPane.add(btnEliminaNP);
		
		JButton btnEliminarNF = new JButton("Elimina Nodo Final");
		btnEliminarNF.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
			  
			    ld.eliminarLast(); 
			
			}
		});
		btnEliminarNF.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 14));
		btnEliminarNF.setBounds(310, 94, 252, 33);
		contentPane.add(btnEliminarNF);
		
		JButton btn_imprimeDelante = new JButton("Imprimir Delante");
		btn_imprimeDelante.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, ld.imprimirDesdeUltimo());
			}
		});
		btn_imprimeDelante.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 14));
		btn_imprimeDelante.setBounds(36, 160, 252, 33);
		contentPane.add(btn_imprimeDelante);
		
		JButton btn_ImprimirDetras = new JButton("Imprimir Detras");
		btn_ImprimirDetras.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, ld.imprimir());
			}
		});
		btn_ImprimirDetras.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 14));
		btn_ImprimirDetras.setBounds(310, 160, 252, 33);
		contentPane.add(btn_ImprimirDetras);
	}
}
