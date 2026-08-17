/**
 * Informações acadêmicas compartilhadas pela capa e pelo rodapé.
 *
 * Edite somente este objeto ao reutilizar o template para outra apresentação.
 */
export interface AcademicPresentation {
  courseName: string
  subjectName: string
  subjectAcronym: string
  subjectCode: string
  professorName: string
  professorContact: string
  presentationTitle: string
}

export const academicConfig = {
  courseName: 'Bacharelado em Sistemas de Informação',
  subjectName: 'Desenvolvimento Orientado a Objetos',
  subjectAcronym: 'DOO',
  subjectCode: 'INF03068',
  professorName: 'Filipe Fernandes, PhD',
  professorContact: 'https://filipefernandesphd.com/',
  presentationTitle: 'Classes, atributos e métodos',
} satisfies AcademicPresentation
