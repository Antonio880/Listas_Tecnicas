import java.util.ArrayList;

public class Biblioteca {

	public ArrayList<Emprestimo> listaEmprestimo;
	public ArrayList<Publicacoes> listaPublicacoes;
	//public ArrayList<Cliente> listaCliente;
	
	public Biblioteca() {
		listaEmprestimo = new ArrayList<Emprestimo>();
		listaPublicacoes = new ArrayList<Publicacoes>();
		//listaCliente = new ArrayList<Cliente>();
	}
	
	public void addEmprestimo(Emprestimo emprestimo) {
		listaEmprestimo.add(emprestimo);
	}
	
	public void addPublicacoes(Publicacoes publicacao) {
		listaPublicacoes.add(publicacao);
	}
	
	/*public void addEmprestimo(Emprestimo emprestimo) {
		this.listaEmprestimo.add(emprestimo);
		
		if(!listaCliente.contains(emprestimo.cliente))
			listaCliente.add(emprestimo.cliente);
		if(!listaPublicacoes.contains(emprestimo.publicacao))
			listaPublicacoes.add(emprestimo.publicacao);
	}*/
	
	
	public void relatorioAcervo() {
	    System.out.println("-------ACERVO-------");
	    int i= 1;
	    System.out.println("Livros");
	    for (Publicacoes publicacoes : listaPublicacoes) {
	        if (publicacoes instanceof Livros) {
	            System.out.println(i + " - " + publicacoes.titulo + "; " + publicacoes.anoPublicacao + "; " + publicacoes.autor + "; " + publicacoes.quantidade);
	            i++;
	        }
	    }
	    i = 1;
	    System.out.println("Artigos");
	    for (Publicacoes publicacoes : listaPublicacoes) {
	        if (publicacoes instanceof Artigo) {
	            System.out.println(i + " - " + publicacoes.titulo + "; " + publicacoes.anoPublicacao + "; " + publicacoes.autor + "; " + publicacoes.quantidade);
	            i++;
	        }
	    }
	    i = 1;
	    System.out.println("Revistas");
	    for (Publicacoes publicacoes : listaPublicacoes) {
	        if (publicacoes instanceof Revista) {
	            System.out.println(i + " - " + publicacoes.titulo + "; " + publicacoes.anoPublicacao + "; " + publicacoes.autor + "; " + publicacoes.quantidade);
	            i++;
	        }
	    }
	    i = 1;
	    System.out.println("TCC");
	    for (Publicacoes publicacoes : listaPublicacoes) {
	        if (publicacoes instanceof TCC) {
	            System.out.println(i + " - " + publicacoes.titulo + "; " + publicacoes.anoPublicacao + "; " + publicacoes.autor + "; " + publicacoes.quantidade);
	            i++;
	        }
	    }
	}

	
	/*public void relatorioClientes() {
		for(Emprestimo emprestimo1: listaEmprestimo) {
			System.out.println("Clientes");
			for (int i = 1; i <= listaEmprestimo.size(); i++) {
				System.out.println(emprestimo1.cliente.tipoCliente);
				System.out.println(i + " - " + emprestimo1.cliente.matricula + "; " + emprestimo1.cliente.nome + "; " + emprestimo1.cliente.TPs);
			}
		}
	}*/
	
	public void relatorioClientes() {
	    System.out.println("Clientes");
	    int i = 1;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        System.out.println(emprestimo.cliente.tipoCliente);
	        System.out.println(i + " - " + emprestimo.cliente.matricula + "; " + emprestimo.cliente.nome + "; " + emprestimo.cliente.TPs);
	        i++;
	    }
	}
	
	
	public void relatorioEmprestimos() {
	    int totalLivrosProfessor = 0;
	    int totalLivrosAluno = 0;
	    int totalLivrosServidor = 0;
	    
	    int totalArtigosProfessor = 0;
	    int totalArtigosAluno = 0;
	    int totalArtigosServidor = 0;
	    
	    int totalTccProfessor = 0;
	    int totalTccAluno = 0;
	    int totalTccServidor = 0;
	    
	    int totalRevistasProfessor = 0;
	    int totalRevistasAluno = 0;
	    int totalRevistasServidor = 0;

	    for (Emprestimo emprestimo : listaEmprestimo) {
	        Publicacoes publicacao = emprestimo.publicacao;
	        if (emprestimo.publicacao instanceof Livros) {
	            if ( emprestimo.cliente instanceof Professor) {
	                totalLivrosProfessor += emprestimo.cliente.publicacoesEmprestadas.size();
	            } else if (emprestimo.cliente instanceof Aluno) {
	                totalLivrosAluno += emprestimo.cliente.publicacoesEmprestadas.size();
	            } else if (emprestimo.cliente instanceof Servidores) {
	                totalLivrosServidor += emprestimo.cliente.publicacoesEmprestadas.size();
	            }
	        } else if (publicacao instanceof Artigo) {
	            if (emprestimo.cliente instanceof Professor) {
	                totalArtigosProfessor += emprestimo.cliente.publicacoesEmprestadas.size();
	            } else if (emprestimo.cliente instanceof Aluno) {
	                totalArtigosAluno += emprestimo.cliente.publicacoesEmprestadas.size();
	            } else if (emprestimo.cliente instanceof Servidores) {
	                totalArtigosServidor += emprestimo.cliente.publicacoesEmprestadas.size();
	            }
	        } else if (publicacao instanceof TCC) {
	            if (emprestimo.cliente instanceof Professor) {
	                totalTccProfessor += emprestimo.cliente.publicacoesEmprestadas.size();
	            } else if (emprestimo.cliente instanceof Aluno) {
	                totalTccAluno += emprestimo.cliente.publicacoesEmprestadas.size();
	            } else if (emprestimo.cliente instanceof Servidores) {
	                totalTccServidor += emprestimo.cliente.publicacoesEmprestadas.size();
	            }
	        } else if (publicacao instanceof Revista) {
	            if (emprestimo.cliente instanceof Professor) {
	                totalRevistasProfessor += emprestimo.cliente.publicacoesEmprestadas.size();
	            } else if (emprestimo.cliente instanceof Aluno) {
	                totalRevistasAluno += emprestimo.cliente.publicacoesEmprestadas.size();
	            } else if (emprestimo.cliente instanceof Servidores) {
	                totalRevistasServidor += emprestimo.cliente.publicacoesEmprestadas.size();
	            }
	        }
	    }
	    System.out.println("Livros: Total " + (totalLivrosAluno + totalLivrosProfessor + totalLivrosServidor) + " - Professor: " + totalLivrosProfessor + " - Aluno: " + totalLivrosAluno + " - Servidores: " + totalLivrosServidor);
		System.out.println("Artigo: Total " + (totalArtigosAluno + totalArtigosProfessor + totalArtigosServidor) + " - Professor: " + totalArtigosProfessor + " - Aluno: " + totalArtigosAluno + " - Servidores: " + totalArtigosServidor);
		System.out.println("TCC: Total " + (totalTccAluno + totalTccProfessor + totalTccServidor) + " - Professor: " + totalTccProfessor + " - Aluno: " + totalTccAluno + " - Servidores: " + totalTccServidor);
		System.out.println("Revistas: Total " + (totalRevistasAluno + totalRevistasProfessor + totalRevistasServidor) + " - Professor: " + totalRevistasProfessor + " - Aluno: " + totalRevistasAluno + " - Servidores: " + totalRevistasServidor);
	}
	
	/*
	 * Ficará faltando somente colocar o nome no relatório de Emprestimo
	 * */

	
	public int emprestimosLivrosProfessor() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Professor && emprestimo.publicacao instanceof Livros) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public int emprestimosLivrosAlunos() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Aluno && emprestimo.publicacao instanceof Livros) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public int emprestimosLivrosServidor() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Servidores && emprestimo.publicacao instanceof Livros) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public int emprestimosArtigosProfessor() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Professor && emprestimo.publicacao instanceof Artigo) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public int emprestimosArtigosAluno() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Aluno && emprestimo.publicacao instanceof Artigo) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public int emprestimosArtigosServidor() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Servidores && emprestimo.publicacao instanceof Artigo) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public int emprestimosTCCProfessor() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Professor && emprestimo.publicacao instanceof TCC) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public int emprestimosTCCAluno() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Aluno && emprestimo.publicacao instanceof TCC) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public int emprestimosTCCServidor() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Servidores && emprestimo.publicacao instanceof TCC) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public int emprestimosRevistaProfessor() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Professor && emprestimo.publicacao instanceof Revista) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public int emprestimosRevistaAluno() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Aluno && emprestimo.publicacao instanceof Revista) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public int emprestimosRevistaServidor() {
	    int count = 0;
	    for (Emprestimo emprestimo : listaEmprestimo) {
	        if (emprestimo.cliente instanceof Servidores && emprestimo.publicacao instanceof Revista) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public void consultaMatricula(int matricula) {
		for (Emprestimo emprestimo : listaEmprestimo) {
			if(emprestimo.cliente.matricula == matricula) {
				System.out.println("Este eh o cliente " + emprestimo.cliente.nome + " e suas pendencias de publicacoes sao: ");
				for (int i = 0; i < emprestimo.cliente.publicacoesEmprestadas.size(); i++) {
					System.out.println(emprestimo.cliente.publicacoesEmprestadas.get(i).titulo);
				}
			}
		}
	}
	
	public void verHistorico() {
		for (Emprestimo emprestimo : listaEmprestimo) {
			System.out.println(emprestimo.cliente.tipoCliente);
			for (int i = 1; i <= emprestimo.cliente.publicacoesEmprestadas.size(); i++) {
				System.out.println(i + " - " + emprestimo.cliente.publicacoesEmprestadas.get(i));
			}
		}
	}
	
	public void buscaPublicacoes(String nome) {
		System.out.println("BUSCA POR NOMES DAS PUBLICACOES");
		for (int i = 0; i < listaPublicacoes.size(); i++) {
			if(nome == listaPublicacoes.get(i).titulo) {
				System.out.println("A Publicacao eh do tipo: " + listaPublicacoes.get(i).tipo + " e tem a seguinte quantidade em estoque: " + listaPublicacoes.get(i).quantidade);
			}
		}
	}
}
