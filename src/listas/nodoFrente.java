package listas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;

public class nodoFrente extends JFrame 
{
	private JTextField txtMatricula;
	private JTextField textAutor;
	private JTextField textCancion;
	private JTextField textAlbum;
	private JTextField textEstilo;
	public nodoFrente()
	{
		 super("Nodo Al Frente");
		 getContentPane().setBackground(Color.GRAY);
		 setForeground(UIManager.getColor("Button.highlight"));
		 setVisible(false);
		 setTitle("ingresa nodo al Frente");
	     setSize(278,337);
	     setResizable(false);
	     getContentPane().setLayout(null);
	     
	     JLabel lblNewLabel = new JLabel("Matricula");
	     lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 14));
	     lblNewLabel.setBounds(20, 11, 106, 14);
	     getContentPane().add(lblNewLabel);
	     
	     txtMatricula = new JTextField();
	     txtMatricula.setBounds(10, 36, 86, 20);
	     getContentPane().add(txtMatricula);
	     txtMatricula.setColumns(10);
	     
	     JLabel lblNewLabel_1 = new JLabel("Autor");
	     lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 14));
	     lblNewLabel_1.setBounds(20, 67, 76, 14);
	     getContentPane().add(lblNewLabel_1);
	     
	     textAutor = new JTextField();
	     textAutor.setBounds(10, 92, 86, 20);
	     getContentPane().add(textAutor);
	     textAutor.setColumns(10);
	     
	     JLabel lblNewLabel_2 = new JLabel("Canci\u00F3n");
	     lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 14));
	     lblNewLabel_2.setBounds(20, 123, 76, 14);
	     getContentPane().add(lblNewLabel_2);
	     
	     textCancion = new JTextField();
	     textCancion.setBounds(10, 148, 86, 20);
	     getContentPane().add(textCancion);
	     textCancion.setColumns(10);
	     
	     JLabel lblNewLabel_4 = new JLabel("Album");
	     lblNewLabel_4.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 14));
	     lblNewLabel_4.setBounds(20, 182, 76, 14);
	     getContentPane().add(lblNewLabel_4);
	     
	     textAlbum = new JTextField();
	     textAlbum.setBounds(10, 207, 86, 20);
	     getContentPane().add(textAlbum);
	     textAlbum.setColumns(10);
	     
	     JLabel lblNewLabel_5 = new JLabel("Estilo");
	     lblNewLabel_5.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 14));
	     lblNewLabel_5.setBounds(20, 238, 76, 14);
	     getContentPane().add(lblNewLabel_5);
	     
	     textEstilo = new JTextField();
	     textEstilo.setBounds(10, 263, 86, 20);
	     getContentPane().add(textEstilo);
	     textEstilo.setColumns(10);
	     
	     JButton btnGuardar = new JButton("Guardar");
	     btnGuardar.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 12));
	     btnGuardar.addActionListener(new ActionListener() 
	     {
	     	public void actionPerformed(ActionEvent arg0)
	     	{
	     	   musica song=new musica();
	     	  Menu_prin mp =new Menu_prin();
	     	   song.setId(Integer.parseInt(txtMatricula.getText()));
	     	   song.setAlbum(textAlbum.getText());
	     	   song.setAutor(textAutor.getText());
	     	   song.setNombreCancion(textCancion.getText());
	     	   song.setStilo(textEstilo.getText());
	     	   mp.ld.insertarPrincipio(song);
	     	   
			   mp.setVisible(true);
			   dispose();
	     	   
	     	}
	     });
	     btnGuardar.setBounds(145, 91, 89, 23);
	     getContentPane().add(btnGuardar);
	     
	     JButton btnCancelar = new JButton("Cancelar");
	     btnCancelar.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 12));
	     btnCancelar.addActionListener(new ActionListener() 
	     {
	     	public void actionPerformed(ActionEvent e) 
	     	{
	     	  
	     		Menu_prin mp =new Menu_prin();
			    mp.setVisible(true);
				dispose();
	     	
	     	}
	     
	     
	     });
	     btnCancelar.setBounds(145, 206, 89, 23);
	     getContentPane().add(btnCancelar);
	
	
	}
}
