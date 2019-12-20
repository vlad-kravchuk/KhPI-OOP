package laba8;

import org.w3c.dom.*;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.*;
import java.util.HashSet;
import java.util.Scanner;

public class Exe {
	public static void exe() throws IOException {
		Container contains = new Container();
		Directory rec1 = new Directory();
		Scanner scan = new Scanner(System.in);
		String str = "";
		String str3 = "";
		boolean loop = true;
		while (loop) {
			Functions.chooseMenu();
			int choose = scan.nextInt();
			switch (choose) {
			case 1:
				rec1.generateDirectory();
				contains.add(rec1);
				System.out.println("�������!");
				break;
			case 2:
				if (contains.size() == 0) {
					System.out.println("������! ������ ������!");
					break;
				} else {
					contains.show();
					break;
				}
			case 3:
				if (contains.size() == 0) {
					System.out.println("������! ������ ������!");
					break;
				} else {
					System.out.print("������� ������� �������� �� 1 �� " + contains.size());
					int index = scan.nextInt();
					if (index > contains.size() || index < 1) {
						System.out.println("��������� ����: ");
					} else {
						contains.remove(index);
						System.out.println("�������!");
					}
				}
				break;
			case 4:
				if (contains.size() == 0) {
					System.out.println("������! ������ ������!");
					break;
				} else {
					contains.clear();
					System.out.println("�������!");
					break;
				}
			case 5:
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				try {
					DocumentBuilder builder = factory.newDocumentBuilder();
					Document document = builder.parse("test.xml");
					Node root = document.getDocumentElement();
					System.out.println("������ ��������: ");
					System.out.println();
					NodeList vacancies = root.getChildNodes();
					for (int i = 0; i < vacancies.getLength(); i++) {
						Node vacancy = vacancies.item(i);
						if (vacancy.getNodeType() != Node.TEXT_NODE) {
							NodeList bookProps = vacancy.getChildNodes();
							for (int j = 0; j < bookProps.getLength(); j++) {
								Node bookProp = bookProps.item(j);
								if (bookProp.getNodeType() != Node.TEXT_NODE) {
									System.out.println(bookProp.getNodeName() + ":"
											+ bookProp.getChildNodes().item(0).getTextContent());
								}
							}
							System.out.println("===========>>>>");
						}
					}

				} catch (ParserConfigurationException | SAXException | IOException ex) {
					ex.printStackTrace(System.out);
				}
				break;
			case 6:
				boolean loop2 = true;
				while (loop2) {
					Functions.chooseMenuFile();
					int choose2 = scan.nextInt();
					switch (choose2) {
					case 1:
						contains.save();
						System.out.println("�������!");
						break;
					case 2:
						Files.walkFileTree(Paths.get("."), new HashSet<FileVisitOption>(), 1, new MyFileVisitor());
						break;
					case 3:
						Path path = Paths.get("save.txt").toAbsolutePath();
						System.out.println(path.getParent());
						break;
					case 4:
						boolean loop5 = true;
						while (loop5) {
							int cho = 0;
							System.out.println("������� ���� � ����������: ");
							str = scan.next();
							Files.walkFileTree(Paths.get(str), new HashSet<FileVisitOption>(), 1, new MyFileVisitor());
							System.out.println("===========================================");
							System.out.println("�� ������� ��������� ���� � ��� ����������?");
							System.out.println("1. - ��. 0. - ���.");
							while (true) {
								cho = scan.nextInt();
								if (cho == 1) {
									str3 = str.concat("\\save.txt");
									contains.save(str3);
									loop5 = false;
									break;
								} else if (cho == 0) {
									break;
								} else {
									System.out.println("������ ��������� ����: ");
								}
							}
						}
						break;
					case 5:
						System.out.println("�� ������� ����������� ���� ����������?");
						System.out.println("1 - ��. 0 - ���.");
						boolean loop4 = true;
						while (loop4) {
							int chosik = scan.nextInt();
							if (chosik == 1) {
								System.out.println("������� ����� ��� �����: ");
								String str1 = scan.next();
								String str4 = str;
								str4 = str4.concat("\\");
								str4 = str4.concat(str1);
								Files.move(Paths.get(str3), Paths.get(str4), StandardCopyOption.REPLACE_EXISTING);
								System.out.println("�������!");
								loop4 = false;
							} else if (chosik == 0) {
								System.out.println("��������� ����� 4");
								loop4 = false;
							} else {
								System.out.println("������! ��������� ����: ");
							}
						}
						break;
					case 6:
						contains.read();
						System.out.println("�������!");
						break;

					case 0:
						System.out.println("�����!");
						loop2 = false;
						break;
					default:
						System.out.println("������. �������� �����!");
						break;
					}
				}
				break;
			case 0:
				System.out.println("������� �� ������!");
				loop = false;
				break;
			default:
				System.out.println("������. �������� �����!");
				break;
			}
		}
	}
}