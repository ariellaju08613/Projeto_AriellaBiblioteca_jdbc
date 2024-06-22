package com.eleodoro.biblioteca.modelo;

public class Biblioteca {

        private String nome;
        private String email;
        private int telefone;
    
        public Biblioteca () {
        }

        public Biblioteca(String nome, String email, int telefone) {
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getTelefone() {
            return telefone;
        }

        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }

        @Override
        public String toString() {
            return "Biblioteca [nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + ((nome == null) ? 0 : nome.hashCode());
            result = prime * result + ((email == null) ? 0 : email.hashCode());
            result = prime * result + telefone;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Biblioteca other = (Biblioteca) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (nome == null) {
                if (other.nome != null)
                    return false;
            } else if (!nome.equals(other.nome))
                return false;
            if (email == null) {
                if (other.email != null)
                    return false;
            } else if (!email.equals(other.email))
                return false;
            if (telefone != other.telefone)
                return false;
            return true;
        }

        private Biblioteca getEnclosingInstance() {
            return Biblioteca.this;
        }

}
