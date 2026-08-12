

leia AGENTS.md

considere as skills: slidev e tdh-method

TAREFA

Crie slides da aula `aula-02`

Topico:  Estado, comportamento e identidade de um objeto

INSTRUCOES

use linguagem Java

criar slides com o proposito de mostrar aos alunos as definicoes de: estado, comportamento e identidade

slides com linguagem simples e acessível para GenZ

se precisar de usar imagens, peça para o agente de IA criar a imagem e já insira nos slides

use o conteudo em LATEX para se basear em alguns conceitos

SAIDA

slides criados

que o aluno saiba:

- saber os conceitos de classe, objeto, estado, comportamento e identidade
- criar uma classe em java
- criar objetos em java
- relacionar o que é estado, comportamento e identidade em codigo java

LATEX

```latex
\subsection{Abstração}

\begin{frame}{Processo de Abstração}
    \begin{enumerate}
        \item O Papel da Decomposição
        \item O Papel da Abstração
        % \item O Papel da Hierarquia
    \end{enumerate}
\end{frame}

\begin{frame}{1. O Papel da Decomposição}
    \begin{itemize}
        \item ``\textbf{\textit{Dividir para conquistar}}'' \cite{dijkstra1979}
        \item Ao projetar um sistema de software complexo, é essencial \textbf{decompô-lo em partes cada vez menores}
        \item Dessa maneira, satisfazemos a restrição muito real que existe na capacidade de canal da \textbf{cognição humana}:
        \begin{itemize}
            \item Para entender qualquer nível de um sistema, precisamos \textbf{compreender apenas algumas partes} (em vez de todas as partes) de uma só vez
        \end{itemize}
    \end{itemize}
\end{frame}

% \begin{frame}{}
%     \centering
%     \includegraphics[scale=.6]{Modules/1_Complexity/Figures/decomposition.png}
% \end{frame}

% \begin{frame}{}
%     \centering
%     \includegraphics[scale=.75]{Modules/MD1/Figures/oo-decomposition.png}
% \end{frame}

\begin{frame}{2. O Papel da Abstração}
    \begin{itemize}
        \item Desconsiderar o que é obsoleto e \textbf{focar no que é mais importante}, de acordo com o contexto
    \end{itemize}
\end{frame}

% \begin{frame}{3. O Papel da Hierarquia}
%     \begin{itemize}
%         \item Manter uma hierarquia é importante porque ilustra como diferentes objetos \textbf{colaboram uns com os outros} por meio de padrões de interação
%         \pause
%         \item Identificar as hierarquias dentro de um sistema de software complexo geralmente \textbf{não é fácil porque requer a descoberta de padrões entre muitos objetos}, cada um dos quais pode incorporar algum comportamento tremendamente complicado
%     \end{itemize}
% \end{frame}

\subsection{Elementos Básicos}

\begin{frame}{}
    \centering
    \includegraphics[scale=.5]{Modules/MD1/Figures/object.png}
\end{frame}

\subsubsection{Objeto}

\begin{frame}{Objeto}
    \begin{itemize}
        \item Um objeto é uma entidade que tem \textbf{estado}, \textbf{comportamento} e \textbf{identidade}
        \item A estrutura e o comportamento de objetos semelhantes são definidos em sua \textbf{classe} comum
        \item Os termos \textbf{instância} e \textbf{objeto} são intercambiáveis
    \end{itemize}
\end{frame}

\subsubsection{Estado de um Objeto}

\begin{frame}{Estado de um Objeto}
    \begin{itemize}
        \item O \textbf{estado} de um objeto abrange todas as propriedades \textbf{estáticas} do objeto
        \item Mais os valores \textbf{dinâmicos} de cada uma dessas propriedades
    \end{itemize}
\end{frame}

\begin{frame}{Estado de um Objeto}
    \centering
    \includegraphics[scale=.6]{Modules/MD1/Figures/objetcs.png}
\end{frame}

\begin{frame}{Estado de um Objeto}
    \centering
    \includegraphics[scale=.7]{Modules/MD1/Figures/class-with-attributes.png}
\end{frame}

\subsubsection{Comportamento de um Objeto}

\begin{frame}{Comportamento de um Objeto}
    \begin{itemize}
        \item \textbf{Comportamento} é como um objeto age e reage, em termos de \textbf{mudanças de estado} e \textbf{troca de mensagens}
        \pause
        \item Em outras palavras, o comportamento de um objeto representa sua atividade externamente visível
        \pause
        \item \textbf{Operação}, \textbf{mensagem} é \textbf{método} são intercambiáveis
    \end{itemize}
\end{frame}

\begin{frame}{Comportamento de um Objeto}
    \centering
    \includegraphics[width=.9\textwidth]{Modules/MD1/Figures/operations.png}
\end{frame}

\begin{frame}{Comportamento de um Objeto}
    \begin{itemize}
        \item Uma operação é um serviço que uma classe oferece a um cliente
        \item Há 5 tipos de operações:
            \begin{itemize}[<+->]
                \item \textbf{Modificador}: uma operação que altera o estado de um objeto
                \item \textbf{Seletor}: uma operação que acessa o estado de um objeto, mas não altera o estado
                \item \textbf{Iterador}: uma operação que permite que todas as partes de um objeto sejam acessadas em alguma ordem bem definida
                \item \textbf{Construtor}: uma operação que cria um objeto e/ou inicializa seu estado
                \item \textbf{Destrutor}: uma operação que libera o estado de um objeto e/ou destrói o objeto em si
            \end{itemize}
    \end{itemize}
\end{frame}

\subsubsection{Papéis e Responsabilidades}

\begin{frame}{}
    \centering
    \includegraphics[scale=.5]{Modules/MD1/Figures/roles1.png}
\end{frame}

\begin{frame}{Papéis e Responsabilidades}
    \begin{itemize}
        % \item Coletivamente, todos os \textbf{métodos} associados a um determinado objeto compõem seu \textbf{protocolo}\footnote{Um conjunto de regras que corroboram para um determinado fim}
        % \item O protocolo de um objeto define o \textbf{encapsulamento do comportamento permitido de um objeto}, no qual compreende toda a visão estática e dinâmica do objeto
        % \item Para a maioria das abstrações não triviais, é útil dividir esse protocolo maior em agrupamentos lógicos de comportamento
        % \item Essas protocolos denotam os \textbf{papéis} que um objeto pode desempenhar
        \item Um \textbf{papel} é uma máscara que um objeto usa para definir uma abstração para seus clientes
        \item As \textbf{responsabilidades} de um objeto são todos os serviços que ele fornece
        \item Em outras palavras, podemos dizer que o \textbf{estado e o comportamento} de um objeto \textbf{definem} coletivamente os \textbf{papéis} que um objeto pode desempenhar no mundo, que por sua vez cumprem as \textbf{responsabilidades} da abstração
    \end{itemize}
\end{frame}

% \begin{frame}{}
%     \centering
%     \includegraphics[scale=.5]{Modules/MD1/Figures/roles2.png}
% \end{frame}

\subsubsection{Identidade}

\begin{frame}{Identidade de um Objeto}
    \begin{itemize}
        \item ``\textbf{Identidade} é a propriedade de um objeto que o distingue de todos os outros objetos'' \cite{khoshafian1986object}
    \end{itemize}
\end{frame}

\begin{frame}[fragile]{Identidade de um Objeto}

    \begin{minted}{java}
        Person person1 = new Person("John")
        Person person2 = new Person("John")
    \end{minted}

\end{frame}

\begin{frame}{Atividade} \label{slide:atividade_abstracao}
    Acesse a \href{https://github.com/filipefernandesphd/DOO/}{Atividade 1}
\end{frame}
```
