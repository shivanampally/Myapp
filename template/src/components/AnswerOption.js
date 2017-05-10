import React from 'react';

function AnswerOption(props) {

  return (
      <button
        type="button"
        className = "btn-primary"
        id={props.answerValue}
        value={props.answerValue}
        onClick={props.onAnswerSelected}
      >{props.answerContent}</button>
  );

}

AnswerOption.propTypes = {
  answerType: React.PropTypes.string.isRequired,
  answerContent: React.PropTypes.string.isRequired,
  answer: React.PropTypes.string.isRequired,
  onAnswerSelected: React.PropTypes.func.isRequired
};

export default AnswerOption;