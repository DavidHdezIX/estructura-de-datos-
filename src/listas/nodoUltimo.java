package listas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField; 

public class nodoUltimo extends JFrame 
{

	private JTextField txtMatricula;
	private JTextField textAutor;
	private JTextField textCancion;
	private JTextField textAlbum;
	private JTextField textEstilo;
	public nodoUltimo()
	{
		 super("Nodo Al Frente");
		 setVisible(false);
		 setTitle("ingresa nodo al Final");
	     setSize(316,400);
	     setResizable(false);
	     getContentPane().setLayout(null);
	     
	     JLabel lblNewLabel = new JLabel("Matricula");
	     lblNewLabel.setBounds(20, 11, 46, 14);
	     getContentPane().add(lblNewLabel);
	     
	     txtMatricula = new JTextField();
	     txtMatricula.setBounds(10, 36, 86, 20);
	     getContentPane().add(txtMatricula);
	     txtMatricula.setColumns(10);
	     
	     JLabel lblNewLabel_1 = new JLabel("Autor");
	     lblNewLabel_1.setBounds(20, 67, 46, 14);
	     getContentPane().add(lblNewLabel_1);
	     
	     textAutor = new JTextField();
	     textAutor.setBounds(10, 92, 86, 20);
	     getContentPane().add(textAutor);
	     textAutor.setColumns(10);
	     
	     JLabel lblNewLabel_2 = new JLabel("Canci\u00F3n");
	     lblNewLabel_2.setBounds(20, 123, 46, 14);
	     getContentPane().add(lblNewLabel_2);
	     
	     textCancion = new JTextField();
	     textCancion.setBounds(10, 148, 86, 20);
	     getContentPane().add(textCancion);
	     textCancion.setColumns(10);
	     
	     JLabel lblNewLabel_4 = new JLabel("Album");
	     lblNewLabel_4.setBounds(20, 242, 46, 14);
	     getContentPane().add(lblNewLabel_4);
	     
	     textAlbum = new JTextField();
	     textAlbum.setBounds(10, 267, 86, 20);
	     getContentPane().add(textAlbum);
	     textAlbum.setColumns(10);
	     
	     JLabel lblNewLabel_5 = new JLabel("Estilo");
	     lblNewLabel_5.setBounds(20, 308, 46, 14);
	     getContentPane().add(lblNewLabel_5);
	     
	     textEstilo = new JTextField();
	     textEstilo.setBounds(10, 340, 86, 20);
	     getContentPane().add(textEstilo);
	     textEstilo.setColumns(10);
	     
	     JButton btnGuardar = new JButton("Guardar");
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
	     	   mp.ld.insertarFinal(song);
	     	   
	     	 
			  mp.setVisible(true);
			  dispose();
	     	
	     	}
	     });
	     btnGuardar.setBounds(194, 91, 89, 23);
	     getContentPane().add(btnGuardar);
	     
	     JButton btnCancelar = new JButton("Cancelar");
	     btnCancelar.addActionListener(new ActionListener() 
	     {
	     	public void actionPerformed(ActionEvent e) 
	     	{
	     	  
	     		Menu_prin mp =new Menu_prin();
			    mp.setVisible(true);
				dispose();
	     	
	     	}
	     
	     
	     });
	     btnCancelar.setBounds(194, 208, 89, 23);
	     getContentPane().add(btnCancelar);
	
	
	}



}
