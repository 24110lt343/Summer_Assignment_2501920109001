async function name() {
    const response  = await fetch('https://api.sms-gate.app/3rdparty/v1/messages', {

  method: 'POST',

  headers: {

    'Authorization': 'Basic ' + btoa('CB_DUC:szouuwt7gfcg45'),

    'Content-Type': 'application/json'

  },

  body: JSON.stringify({

    textMessage: { text: "Hello World" },

    phoneNumbers: ["+916388079667"]

  })

});
console.log(response);
}


name();