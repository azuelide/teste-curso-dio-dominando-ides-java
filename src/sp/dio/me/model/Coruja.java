package sp.dio.me.model;

import java.util.Objects;

public class Coruja {

			private String nome;
			private String cor;
			private Integer idade;
			public Coruja() {	}
			
			public Coruja(String nome, String cor, Integer idade) {
				this.nome = nome;
				this.cor = cor;
				this.idade = idade;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getCor() {
				return cor;
			}

			public void setCor(String cor) {
				this.cor = cor;
			}

			public Integer getIdade() {
				return idade;
			}

			public void setIdade(Integer idade) {
				this.idade = idade;
			}

			@Override
			public int hashCode() {
				return Objects.hash(cor, idade, nome);
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Coruja other = (Coruja) obj;
				return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade)
						&& Objects.equals(nome, other.nome);
			}

			@Override
			public String toString() {
				return "Coruja [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
			}
		
			
			/*public Coruja (String nome, String cor, Integer idade) {
				this.nome = nome;
				this.cor = cor;
				this.idade = idade;
				
			}*/
			
			
			
}
