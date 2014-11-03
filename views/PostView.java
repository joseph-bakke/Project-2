package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.Post;

public class PostView extends JPanel {

	private JLabel title;
	private JLabel author;
	private JLabel icon;
	
	private JPanel textPanel;
	private JPanel imagePanel;
	
	private Post postData;
	
	public PostView(Post p) {
		setLayout(new BorderLayout());
		this.postData = p;
		
		//Setup postText panel
		this.textPanel = new JPanel();
		this.textPanel.setLayout(new BoxLayout(this.textPanel, BoxLayout.Y_AXIS));
		
		this.imagePanel = new JPanel();
		this.imagePanel.setLayout(new BorderLayout());
		
		this.title = new JLabel(p.getTitle());
		this.author = new JLabel(p.getAuthor());
		
        JPanel pic = new JPanel();
        JLabel text = new JLabel("(Photo)");
        pic.add(text);
        pic.setPreferredSize(new Dimension(100, 20));
        pic.setBackground(Color.gray);
        imagePanel.add(pic, BorderLayout.CENTER);
		
		this.textPanel.add(title);
		this.textPanel.add(author);
		
		add(textPanel, BorderLayout.CENTER);
		add(imagePanel, BorderLayout.EAST);
		
	}
}
