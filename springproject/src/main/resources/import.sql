INSERT INTO modeadmistration (descriptionmode) VALUES ("Administracion oral")
INSERT INTO modeadmistration (descriptionmode) VALUES ("Inyeccion")

INSERT INTO unitmeasurement (nameun) VALUES ("ml")
INSERT INTO unitmeasurement (nameun) VALUES ("mm")
INSERT INTO unitmeasurement (nameun) VALUES ("cm")

INSERT INTO activeprinciple (nameap) VALUES ("principio activo tipo A")
INSERT INTO activeprinciple (nameap) VALUES ("principio activo tipo B")
INSERT INTO activeprinciple (nameap) VALUES ("principio activo tipo C")

INSERT INTO country (codecountry, namecountry) VALUES ("col", "Colombia")
INSERT INTO country (codecountry, namecountry) VALUES ("arg", "Argentina")

INSERT INTO region (codereg, namereg, codecountry) VALUES ("reg1", "Orinoquia", "col")
INSERT INTO region (codereg, namereg, codecountry) VALUES ("reg2", "Andina", "col")


INSERT INTO city (codecity, namecity, codereg) VALUES ("c001", "Bogota", "reg2")
INSERT INTO city (codecity, namecity, codereg) VALUES ("c002", "Bucaramanga", "reg2")

INSERT INTO laboratory (namelab, codecityreg) VALUES ("Laboratorio ABC","c001")
INSERT INTO laboratory (namelab, codecityreg) VALUES ("Laboratorio DEF","c002")

INSERT INTO customer (idcustomer, namecustomer, lastnamecustomer, codecitycustomer, emailcustomer, birthdate, lon, latitud) VALUES ("cus0001","pepito", "perez", "c002", "pepito@gmail.com", "02/02/1990", "-1.5156", "17.541541")
INSERT INTO customer (idcustomer, namecustomer, lastnamecustomer, codecitycustomer, emailcustomer, birthdate, lon, latitud) VALUES ("cus0002","ana", "gonzalez", "c001", "anita@gmail.com", "01/01/1998", "1.5156", "-1.541541")

INSERT INTO medicine (proceedings, namemedicine, healthregister, description, descriptionshort,codemodeadmin, codeap, codeum, namerol, codelab) VALUES ("proceedings A", "diclofenaco", "register1", "tomar cada 8 horas", "pastillas", 1, 1, 1, "medico general", 1)
INSERT INTO medicine (proceedings, namemedicine, healthregister, description, descriptionshort,codemodeadmin, codeap, codeum, namerol, codelab) VALUES ("proceedings B", "penisilina", "register1", "usar cada 24 horas", "inyección", 2, 2, 2, "medico general", 2)

INSERT INTO farmacy (namefarmacy, addressfarmacy, long, latfarmacy, codecityfarmacy, logofarmacy) VALUES ("Farmacia ABC", "calle A30", "-1.0000441", "1.522200", "c001", "logo 1")
INSERT INTO farmacy (namefarmacy, addressfarmacy, long, latfarmacy, codecityfarmacy, logofarmacy) VALUES ("Farmacia CBA", "carrera 17 - 30", "-1.0000441", "1.522200", "c002", "logo 2")

INSERT INTO farmacymedicine (idfarmacy, idmedicinefatrm, price) VALUES (1, 2, 8000)
INSERT INTO farmacymedicine (idfarmacy, idmedicinefatrm, price) VALUES (2, 1, 50000)
