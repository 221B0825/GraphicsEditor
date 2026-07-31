# GraphicsEditor

Using Java in 2021  
📌: Paint Program (Java Swing 기반 그래픽 에디터)

[![License](https://img.shields.io/github/license/221b0825/GraphicsEditor)](LICENSE)  
[![Last Commit](https://img.shields.io/github/last-commit/221b0825/GraphicsEditor)](https://github.com/221b0825/UnivGraphicsEditor/commits/main)

## 🚀 Introduction
Java 기반으로 제작된 간단한 그래픽 편집기입니다. 도형 그리기, 변형, 실행 취소 등 기본적인 그래픽 편집 기능을 제공하며, 패키지 단위로 구조화되어 코드 가독성과 유지보수가 용이합니다.

---

## 📸 Preview

<div align="center">
  <img src="https://github.com/user-attachments/assets/c40b6154-e2c6-4c73-883c-1e07b7226f66" alt="Project Preview" height="500px">
  <p><em>실행 화면</em></p>
</div>

---

## ✨ Features

* 📂 **모듈화된 구조**
  기능별로 패키지를 나누어 관리: 프레임/패널, 메뉴바, 툴바, 도형 툴 등의 유지보수와 기능 추가가 용이

* ✏️ **도형 그리기 도구 (Shape Tools)**
  선(`GLine`), 타원(`GOval`), 사각형(`GRectangle`), 다각형(`GPolygon`) 등 기본 도형을 마우스로 그릴 수 있음  

* 🔄 **변형 도구 (Transformer)**

  * **이동**: `GMover`를 통해 도형을 드래그하여 위치 변경
  * **크기 조절**: `GResizer`로 도형 크기를 실시간 조정
  * **회전**: `GRotater`로 중심 기준 회전 적용

* 🧠 **Undo/Redo 지원**
  `GUndoStack`을 통해 이전 작업 상태로 되돌릴 수 있어 복구 가능

* 🖱️ **UI 구성 요소**
  `GMenuBar`, `GFileMenu`, `GEditMenu`로 구성된 메뉴, `GToolBar`로 툴 선택, `GFrame`과 `GPanel`로 전체 UI 레이아웃 구성

* ⚙️ **상수 및 설정 관리**
  `GConstants`에 공통 사용값(예: 액션 타입 등)을 정의하여 하드코딩 지양 및 일관성 유지

---

## 📂 Folder Structure

```plaintext
GraphicsEditor/
├── src/
│   ├── frame/
│   │   ├── GFrame.java
│   │   ├── GMenuBar.java
│   │   ├── GPanel.java
│   │   └── GToolBar.java
│   ├── main/
│   │   ├── GConstants.java
│   │   └── GMain.java
│   ├── menu/
│   │   ├── GEditMenu.java
│   │   ├── GFileMenu.java
│   │   └── GUndoStack.java
│   ├── shapeTools/
│   │   ├── GLine.java
│   │   ├── GOval.java
│   │   ├── GPolygon.java
│   │   ├── GRectangle.java
│   │   └── GShapeTool.java
│   └── transformer/
│       ├── GMover.java
│       ├── GResizer.java
│       ├── GRotater.java
│       └── GTransformer.java
└── test/
```

---

## 🛠️ Built With

* **Programming Language**: Java (JDK 13)
* **Library / Framework**: Java Swing (UI 구성), AWT (Abstract Window Toolkit)

---

## 📧 Contact

* **Name**: Eunseo Yu
* **E-mail**: [eunseoyu0825@gmail.com](mailto:eunseoyu0825@gmail.com)
* **GitHub**: [221B0825](https://github.com/221b0825)
